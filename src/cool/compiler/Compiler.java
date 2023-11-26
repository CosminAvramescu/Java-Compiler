package cool.compiler;

import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }

        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;

        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;

        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);

            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);


////            // Test lexer only.
//            tokenStream.fill();
//            List<Token> tokens = tokenStream.getTokens();
//            tokens.stream().forEach(token -> {
//                var text = token.getText();
//                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
//
//                System.out.println(text + " : " + name);
////                System.out.println(token);
//            });


            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);

            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                            line + ":" + (charPositionInLine + 1) + ", ";

                    Token token = (Token) offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;

                    System.err.println(newMsg);
                    errors = true;
                }
            };

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));

            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        // TODO Print tree
        var input = CharStreams.fromFileName(args[0]);

        lexer = new CoolLexer(input);
        tokenStream = new CommonTokenStream(lexer);

        parser = new CoolParser(tokenStream);
        var tree = parser.program();

        var astConstructionVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                List<Definition> list = new ArrayList<>();
                for (CoolParser.DefinitionContext e : ctx.defns) {
                    list.add((Definition) visit(e));
                }
                return new Program(ctx.start, list);
            }

            @Override
            public ASTNode visitClassDef(CoolParser.ClassDefContext ctx) {
                List<Definition> list = new ArrayList<>();
                for (CoolParser.FeatureContext e : ctx.defns) {
                    list.add((Definition) visit(e));
                }
                return new Cls(ctx.start, ctx.className, ctx.inheritedClass, list);
            }

            @Override
            public ASTNode visitVarDef(CoolParser.VarDefContext ctx) {
                if (ctx.init == null) {
                    return new VarDef(ctx.start, ctx.name, ctx.type,
                            null, false, false);
                } else {
                    // variabila initializata
                    return new VarDef(ctx.start, ctx.name, ctx.type,
                            (Expression) visit(ctx.init), false, false);
                }
            }

            @Override
            public ASTNode visitFuncDef(CoolParser.FuncDefContext ctx) {
                List<VarDef> list = new ArrayList<>();

                for (int i = 0; i < ctx.formals.size(); i++) {
                    list.add(new VarDef(ctx.start, ctx.formals.get(i).name,
                            ctx.formals.get(i).type, null, true, false));
                }

                if (ctx.body != null) {
                    return new FuncDef(ctx.start, ctx.name, ctx.type,
                            (Expression) visit(ctx.body), list, null);
                } else {
                    // block in interiorul functiei
                    return new FuncDef(ctx.start, ctx.name, ctx.type,
                            null, list, (Block) visit(ctx.bodyBlock));
                }
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                List<Expression> list = new ArrayList<>();

                for (int i = 0; i < ctx.exprs.size(); i++) {
                    list.add((Expression) visit(ctx.exprs.get(i)));
                }

                return new Block(ctx.start, list);
            }

            @Override
            public ASTNode visitDispatch(CoolParser.DispatchContext ctx) {
                List<Expression> list = new ArrayList<>();

                for (int i = 0; i < ctx.args.size(); i++) {
                    list.add((Expression) visit(ctx.args.get(i)));
                }
                if (ctx.DOT() != null) {
                    return new Dispatch(ctx.DOT().getSymbol(), ctx.specifiedClass,
                            ctx.called, (Expression) visit(ctx.caller), list);
                } else {
                    // dispatch fara .
                    return new Dispatch(null, ctx.specifiedClass,
                            ctx.called, (Expression) visit(ctx.caller), list);
                }
            }

            @Override
            public ASTNode visitIf(CoolParser.IfContext ctx) {
                return new If(ctx.start,
                        (Expression) visit(ctx.cond),
                        (Expression) visit(ctx.thenBranch),
                        (Expression) visit(ctx.elseBranch));
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                List<VarDef> list = new ArrayList<>();

                for (int i = 0; i < ctx.vars.size(); i++) {
                    VarDef v = (VarDef) visit(ctx.vars.get(i));
                    v.local = true;
                    list.add(v);
                }

                if (ctx.e != null) {
                    return new Let(ctx.start, list, (Expression) visit(ctx.e), null);
                } else {
                    // let cu block body
                    return new Let(ctx.start, list, null, (Block) visit(ctx.blockBody));
                }
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                List<Branch> list = new ArrayList<>();

                for (int i = 0; i < ctx.branches.size(); i++) {
                    list.add((Branch) visit(ctx.branches.get(i)));
                }

                return new Case(ctx.start, (Expression) visit(ctx.cond), list);
            }

            @Override
            public ASTNode visitBranch(CoolParser.BranchContext ctx) {
                // branch-urile din case
                if (ctx.e != null) {
                    return new Branch(ctx.start, ctx.name, ctx.type,
                            (Expression) visit(ctx.e), null);
                } else {
                    return new Branch(ctx.start, ctx.name, ctx.type,
                            null, (Block) visit(ctx.blockBody));
                }
            }
            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                if (ctx.e != null) {
                    return new While(ctx.start, (Expression) visit(ctx.cond),
                            (Expression) visit(ctx.e), null);
                } else {
                    return new While(ctx.start, (Expression) visit(ctx.cond),
                            null, (Block) visit(ctx.blockBody));
                }
            }
            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return new Id(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return new Int(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitPlusMinus(CoolParser.PlusMinusContext ctx) {
                if (Objects.equals(ctx.op.getText(), "+")) {
                    return new PlusMinus(ctx.PLUS().getSymbol(),
                            (Expression) visit(ctx.left),
                            (Expression) visit(ctx.right));
                } else if (Objects.equals(ctx.op.getText(), "-")) {
                    return new PlusMinus(ctx.MINUS().getSymbol(),
                            (Expression) visit(ctx.left),
                            (Expression) visit(ctx.right));
                } else {
                    return null;
                }
            }

            @Override
            public ASTNode visitUnaryMinus(CoolParser.UnaryMinusContext ctx) {
                return new UnaryMinus(ctx.TILDE().getSymbol(), (Expression) visit(ctx.e));
            }

            @Override
            public ASTNode visitSelf(CoolParser.SelfContext ctx) {
                return new Self(ctx.SELF().getSymbol());
            }

            @Override
            public ASTNode visitIsvoid(CoolParser.IsvoidContext ctx) {
                return new IsVoid(ctx.ISVOID().getSymbol(), (Expression) visit(ctx.e));
            }

            @Override
            public ASTNode visitNewObj(CoolParser.NewObjContext ctx) {
                return new NewObj(ctx.NEW().getSymbol(), ctx.name);
            }

            @Override
            public ASTNode visitRelational(CoolParser.RelationalContext ctx) {
                return new Relational(ctx.op, (Expression) visit(ctx.left),
                        (Expression) visit(ctx.right));
            }

            @Override
            public ASTNode visitNegate(CoolParser.NegateContext ctx) {
                return new Negate(ctx.NOT().getSymbol(), (Expression) visit(ctx.e));
            }

            @Override
            public ASTNode visitMultDiv(CoolParser.MultDivContext ctx) {
                if (Objects.equals(ctx.op.getText(), "*")) {
                    return new MultDiv(ctx.MULT().getSymbol(),
                            (Expression) visit(ctx.left),
                            (Expression) visit(ctx.right));
                } else if (Objects.equals(ctx.op.getText(), "/")) {
                    return new MultDiv(ctx.DIV().getSymbol(),
                            (Expression) visit(ctx.left),
                            (Expression) visit(ctx.right));
                } else {
                    return null;
                }
            }

            @Override
            public ASTNode visitAssign(CoolParser.AssignContext ctx) {
                return new Assign(ctx.ASSIGN().getSymbol(), ctx.name, (Expression) visit(ctx.e));
            }

            @Override
            public ASTNode visitParen(CoolParser.ParenContext ctx) {
                return new Paren(ctx.start, (Expression) visit(ctx.e));
            }

            @Override
            public ASTNode visitBool(CoolParser.BoolContext ctx) {
                return new Bool(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitStr(CoolParser.StrContext ctx) {
                return new Str(ctx.STRING().getSymbol());
            }
        };

        // ast este AST-ul proaspăt construit pe baza arborelui de derivare.
        var ast = astConstructionVisitor.visit(tree);

        var printVisitor = new ASTVisitor<Void>() {
            int indent = 0;

            // print tree
            @Override
            public Void visit(Program program) {
                printIndent("program");
                for (Definition e : program.list) {
                    indent++;
                    e.accept(this);
                    indent--;
                }
                return null;
            }

            @Override
            public Void visit(Cls cls) {
                if (cls.inheritedClass == null) {
                    printIndent("class");
                    indent++;
                    printIndent(cls.className.getText());
                    for (Definition e : cls.definitions) {
                        e.accept(this);
                    }
                    indent--;
                } else {
                    // clasa cu mostenire
                    printIndent("class");
                    indent++;
                    printIndent(cls.className.getText());
                    printIndent(cls.inheritedClass.getText());
                    for (Definition e : cls.definitions) {
                        e.accept(this);
                    }
                    indent--;
                }

                return null;
            }

            @Override
            public Void visit(VarDef varDef) {
                if (varDef.formal) {
                    printIndent("formal");
                } else {
                    if (varDef.local) {
                        printIndent("local");
                    } else {
                        printIndent("attribute");
                    }
                }
                indent++;
                printIndent(varDef.name.getText());
                printIndent(varDef.type.getText());
                if (varDef.e != null) {
                    varDef.e.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(FuncDef funcDef) {
                printIndent("method");
                indent++;
                printIndent(funcDef.name.getText());
                for (int i = 0; i < funcDef.formals.size(); i++) {
                    funcDef.formals.get(i).accept(this);
                }
                printIndent(funcDef.type.getText());
                if (funcDef.body != null) {
                    funcDef.body.accept(this);
                } else {
                    funcDef.block.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Let let) {
                printIndent("let");
                indent++;
                for (int i = 0; i < let.vars.size(); i++) {
                    let.vars.get(i).accept(this);
                }
                if (let.e != null) {
                    let.e.accept(this);
                } else {
                    let.block.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Case casee) {
                printIndent("case");
                indent++;
                casee.cond.accept(this);
                for (int i = 0; i < casee.branches.size(); i++) {
                    casee.branches.get(i).accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Branch branch) {
                printIndent("case branch");
                indent++;
                printIndent(branch.name.getText());
                printIndent(branch.type.getText());
                if (branch.e != null) {
                    branch.e.accept(this);
                } else {
                    branch.block.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Block block) {
                printIndent("block");
                indent++;
                for (Expression e : block.exprs) {
                    e.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Dispatch dispatch) {
                if (dispatch.specifiedClass == null && dispatch.token == null
                        && dispatch.called == null) {
                    printIndent("implicit dispatch");
                }
                if (dispatch.token != null) {
                    printIndent(dispatch.token.getText());
                }
                indent++;
                if (dispatch.caller != null) {
                    dispatch.caller.accept(this);
                }
                indent--;
                indent++;
                if (dispatch.specifiedClass != null) {
                    printIndent(dispatch.specifiedClass.getText());
                }
                indent--;
                indent++;
                if (dispatch.called != null) {
                    printIndent(dispatch.called.getText());
                }
                indent--;
                for (int i = 0; i < dispatch.args.size(); i++) {
                    indent++;
                    dispatch.args.get(i).accept(this);
                    indent--;
                }
                return null;
            }

            @Override
            public Void visit(If iff) {
                printIndent("if");
                indent++;
                iff.cond.accept(this);
                iff.thenBranch.accept(this);
                iff.elseBranch.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(While whilee) {
                printIndent("while");
                indent++;
                whilee.cond.accept(this);
                if (whilee.e != null) {
                    whilee.e.accept(this);
                } else {
                    whilee.block.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Id id) {
                printIndent(id.token.getText());
                return null;
            }

            @Override
            public Void visit(Int intt) {
                printIndent(intt.token.getText());
                return null;
            }

            @Override
            public Void visit(Bool b) {
                printIndent(b.token.getText());
                return null;
            }

            @Override
            public Void visit(Str s) {
                printIndent(s.token.getText());
                return null;
            }

            @Override
            public Void visit(UnaryMinus u) {
                printIndent(u.token.getText());
                indent++;
                u.a.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Self s) {
                printIndent(s.token.getText());
                return null;
            }

            @Override
            public Void visit(IsVoid u) {
                printIndent(u.token.getText());
                indent++;
                u.a.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(NewObj u) {
                printIndent(u.token.getText());
                indent++;
                printIndent(u.a.getText());
                indent--;
                return null;
            }

            @Override
            public Void visit(Relational rel) {
                printIndent(rel.token.getText());
                indent++;
                rel.a.accept(this);
                rel.b.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Negate negate) {
                printIndent(negate.token.getText());
                indent++;
                negate.a.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(PlusMinus p) {
                printIndent(p.token.getText());
                indent++;
                p.a.accept(this);
                p.b.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(MultDiv p) {
                printIndent(p.token.getText());
                indent++;
                p.a.accept(this);
                p.b.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Assign p) {
                printIndent(p.token.getText());
                indent++;
                printIndent(p.a.getText());
                p.b.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Paren p) {
                p.a.accept(this);
                return null;
            }

            void printIndent(String str) {
                for (int i = 0; i < indent; i++)
                    System.out.print("  ");
                System.out.println(str);
            }
        };


        ast.accept(printVisitor);
    }
}
