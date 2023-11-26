parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program
    :   (defns+=definition)* EOF
    ;

definition
    :   CLASS className=ID (INHERITS inheritedClass=(TYPE|ID))? LBRACE (defns+=feature)* RBRACE SEMI  # classDef
    ;

feature
    : name=ID LPAREN (formals+=formal (COMMA formals+=formal)*)? RPAREN
                 COLON type=(TYPE|ID) LBRACE (bodyBlock=block | body=expr) RBRACE SEMI   # funcDef
    |  name=ID COLON type=(TYPE|ID) (ASSIGN init=expr)? SEMI?           # varDef
    ;

block
    : LBRACE (exprs+=expr SEMI)* RBRACE
    ;

formal
    :   name=ID COLON type=(TYPE|ID)
    ;

branch
    : name=ID COLON type=(TYPE|ID) ARROW (e=expr | blockBody=block) SEMI
    ;

expr
    :   caller=expr (ATSIGN specifiedClass=ID)? (DOT called=ID)?
        LPAREN (args+=expr (COMMA args+=expr)*)? RPAREN             # dispatch
    |   LPAREN e=expr RPAREN                                        # paren
    |   TILDE e=expr                                                # unaryMinus
    |   NEW name=ID                                                 # newObj
    |   ISVOID e=expr                                               # isvoid
    |   left=expr op=(MULT | DIV) right=expr                        # multDiv
    |   left=expr op=(PLUS | MINUS) right=expr                      # plusMinus
    |   left=expr op=(LT | LE | EQUAL) right=expr                   # relational
    |   IF cond=expr THEN thenBranch=expr ELSE elseBranch=expr FI   # if
    |   WHILE cond=expr LOOP LBRACE? (e=expr | blockBody=block)
            RBRACE? POOL                                            # while
    |   LET (vars+=feature (COMMA vars+=feature)*)? IN
        LBRACE? (e=expr | blockBody=block) RBRACE?                  # let
    |   CASE cond=expr OF (branches+=branch)+ ESAC                  # case
    |   NOT e=expr                                                  # negate
    |   name=ID ASSIGN e=expr                                       # assign
    |   SELF                                                        # self
    |   ID                                                          # id
    |   INT                                                         # int
    |   STRING                                                      # str
    |   BOOL                                                        # bool
    ;