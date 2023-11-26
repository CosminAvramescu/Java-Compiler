package cool.compiler;

public interface ASTVisitor<T> {
    T visit(Id id);

    T visit(Self s);

    T visit(Int intt);

    T visit(If iff);

    T visit(While whilee);

    T visit(Let let);

    T visit(Case casee);

    T visit(Branch branch);

    T visit(Block block);
    T visit(Bool b);

    T visit(Str s);

    T visit(PlusMinus p);

    T visit(UnaryMinus u);

    T visit(Negate n);

    T visit(IsVoid i);

    T visit(NewObj n);

    T visit(Relational p);

    T visit(MultDiv m);

    T visit(Assign a);

    T visit(Paren p);

    T visit(Cls c);

    T visit(Program p);

    T visit(VarDef v);

    T visit(FuncDef f);

    T visit(Dispatch d);
}

