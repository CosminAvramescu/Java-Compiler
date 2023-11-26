package cool.compiler;

import org.antlr.v4.runtime.Token;

import java.util.List;

// Rădăcina ierarhiei de clase reprezentând nodurile arborelui de sintaxă
// abstractă (AST). Singura metodă permite primirea unui visitor.
public abstract class ASTNode {
    // Reținem un token descriptiv, pentru a putea afișa ulterior
    // informații legate de linia și coloana eventualelor erori semantice.
    Token token;

    ASTNode(Token token) {
        this.token = token;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

abstract class Definition extends ASTNode {
    Definition(Token token) {
        super(token);
    }
}

abstract class Expression extends Definition {
    Expression(Token token) {
        super(token);
    }
}

class Program extends Expression {
    List<Definition> list;

    Program(Token token, List<Definition> list) {
        super(token);
        this.list = list;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Cls extends Expression {
    Token className;
    Token inheritedClass;

    List<Definition> definitions;

    Cls(Token token, Token className, Token inheritedClass, List<Definition> definitions) {
        super(token);
        this.className = className;
        this.inheritedClass = inheritedClass;
        this.definitions = definitions;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class VarDef extends Expression {
    Boolean formal;

    Boolean local;
    Token name;
    Token type;
    Expression e;

    VarDef(Token token, Token name, Token type, Expression e, Boolean formal, Boolean local) {
        super(token);
        this.name = name;
        this.type = type;
        this.e = e;
        this.formal = formal;
        this.local = local;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class FuncDef extends Expression {
    Token name;
    Token type;
    List<VarDef> formals;
    Expression body;

    Block block;

    FuncDef(Token token, Token name, Token type, Expression body, List<VarDef> formals, Block block) {
        super(token);
        this.name = name;
        this.type = type;
        this.body = body;
        this.formals = formals;
        this.block = block;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


class Block extends Expression {
    List<Expression> exprs;

    Block(Token token, List<Expression> exprs) {
        super(token);
        this.exprs = exprs;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Case extends Expression {
    List<Branch> branches;
    Expression cond;

    Case(Token token, Expression cond, List<Branch> branches) {
        super(token);
        this.cond = cond;
        this.branches = branches;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Branch extends Expression {
    Token name;

    Token type;

    Expression e;

    Block block;

    Branch(Token token, Token name, Token type, Expression e, Block block) {
        super(token);
        this.name = name;
        this.type = type;
        this.e = e;
        this.block = block;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


class Dispatch extends Expression {
    Token specifiedClass;
    Token called;
    Expression caller;

    List<Expression> args;

    Dispatch(Token token, Token specifiedClass, Token called,
             Expression caller, List<Expression> args) {
        super(token);
        this.specifiedClass = specifiedClass;
        this.called = called;
        this.caller = caller;
        this.args = args;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class If extends Expression {
    // Sunt necesare trei câmpuri pentru cele trei componente ale expresiei.
    Expression cond;
    Expression thenBranch;
    Expression elseBranch;

    If(Token start,
       Expression cond,
       Expression thenBranch,
       Expression elseBranch) {
        super(start);
        this.cond = cond;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class While extends Expression {
    Expression cond;
    Expression e;

    Block block;

    While(Token start, Expression cond, Expression e, Block block) {
        super(start);
        this.cond = cond;
        this.e = e;
        this.block = block;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Let extends Expression {
    List<VarDef> vars;
    Expression e;

    Block block;

    Let(Token start, List<VarDef> vars, Expression e, Block block) {
        super(start);
        this.vars = vars;
        this.e = e;
        this.block = block;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


class Id extends Expression {
    Id(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Self extends Expression {
    Self(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Int extends Expression {
    Int(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Bool extends Expression {
    Bool(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Str extends Expression {
    Str(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class PlusMinus extends Expression {
    Expression a;

    Expression b;

    PlusMinus(Token token, Expression a, Expression b) {
        super(token);
        this.a = a;
        this.b = b;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class MultDiv extends Expression {
    Expression a;

    Expression b;

    MultDiv(Token token, Expression a, Expression b) {
        super(token);
        this.a = a;
        this.b = b;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class UnaryMinus extends Expression {
    Expression a;

    UnaryMinus(Token token, Expression a) {
        super(token);
        this.a = a;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Negate extends Expression {
    Expression a;

    Negate(Token token, Expression a) {
        super(token);
        this.a = a;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Relational extends Expression {
    Expression a;

    Expression b;

    Relational(Token token, Expression a, Expression b) {
        super(token);
        this.a = a;
        this.b = b;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Assign extends Expression {
    Token a;
    Expression b;

    Assign(Token token, Token a, Expression b) {
        super(token);
        this.a = a;
        this.b = b;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Paren extends Expression {
    Expression a;

    Paren(Token token, Expression a) {
        super(token);
        this.a = a;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class IsVoid extends Expression {
    Expression a;

    IsVoid(Token token, Expression a) {
        super(token);
        this.a = a;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NewObj extends Expression {
    Token a;

    NewObj(Token token, Token a) {
        super(token);
        this.a = a;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
