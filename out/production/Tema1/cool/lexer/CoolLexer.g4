lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;	
}

@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

IF : 'if';
THEN : 'then';
ELSE : 'else';
FI: 'fi';
CLASS: 'class';
INHERITS: 'inherits';
WHILE: 'while';
LOOP: 'loop';
POOL: 'pool';
NOT: 'not';
ISVOID: 'isvoid';
NEW: 'new';
SELF: 'self';
ATSIGN: '@';
LET: 'let';
IN: 'in';
CASE: 'case';
OF: 'of';
ESAC: 'esac';

BOOL : 'true' | 'false';

TYPE : 'Int' | 'String' | 'Object' | 'IO' | 'Bool' | 'SELF_TYPE';

fragment LETTER : [a-zA-Z];
ID : (LETTER | '_')(LETTER | '_' | DIGIT)*;

fragment DIGIT : [0-9];
INT : DIGIT+;

fragment DIGITS : DIGIT+;
fragment EXPONENT : 'e' ('+' | '-')? DIGITS;
FLOAT : (DIGITS ('.' DIGITS?)? | '.' DIGITS) EXPONENT?;

STRING : '"' ('\\"' | '\\' '\r'? '\n' | .)*? ('"'
       {
           String s = getText().substring(1, getText().length()-1);
            for (int i = 2; i < s.length(); i++) {
                if ((s.charAt(i) == '\n' && s.charAt(i - 2) != '\\' && s.charAt(i-1) == '\r')){
                    raiseError("Unterminated string constant");
                    return;
                }
            }
            if(s.length()>1024){
                raiseError("String constant too long");
                return;
            }
            if(s.contains("\u0000")==true){
                raiseError("String contains null character");
                return;
            }
            String newStr = "";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '\\')
                {
                    if(s.charAt(i+1) == 't')
                    {
                        newStr += '\t';
                        i++;
                    }
                    else if(s.charAt(i+1) == 'n')
                    {
                        newStr += '\n';
                        i++;
                    }
                    else if(s.charAt(i+1) == 'b')
                    {
                        newStr += '\b';
                        i++;
                    }
                    else if(s.charAt(i+1) == 'f')
                    {
                        newStr += '\f';
                        i++;
                    }
                    else
                    {
                        newStr += s.charAt(i+1);
                        i++;
                    }
                }
                else
                {
                    newStr+=s.charAt(i);
                }
            }
            setText(newStr);
    }
    | (~'\\' '\r'? '\n') { raiseError("Unterminated string constant"); }
    | EOF
    {
        raiseError("EOF in string constant");
    })
    ;

SEMI : ';';

DOT : '.';

COLON : ':';

COMMA : ',';

ASSIGN: '<-';

TILDE : '~';

EQUAL : '=';

LPAREN : '(';

RPAREN : ')';

LBRACE : '{';

RBRACE : '}';

PLUS : '+';

MINUS : '-';

MULT : '*';

DIV : '/';

LT : '<';

LE : '<=';

ARROW : '=>';

fragment NEW_LINE : '\r'? '\n';

LINE_COMMENT
    : '--' .*? (NEW_LINE | EOF) -> skip
    ;

BLOCK_COMMENT
    : '(*'
      (BLOCK_COMMENT | .)*?
      ('*)') -> skip
    ;

UNMATCHED_COMMENT
    :  '*)'
       (.)*?
       ~('(' | '*') { raiseError("Unmatched *)"); }
    ;

EOF_COMMENT
    : '(*'
      (BLOCK_COMMENT | ~[*)])*?
      EOF { raiseError("EOF in comment"); }
    ;

WS
    :   [ \n\f\r\t]+ -> skip
    ;

INVALID_CHARACTER: ~[ \t\r\n] { raiseError("Invalid character: "+getText()); };