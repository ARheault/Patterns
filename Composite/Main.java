/**
 * Statement ::= Assignment | Conditional | While | Compound 
 * Assignment ::= Var := Expr
 * Conditional ::= if Expr then Statement else Statement
 * While ::= while Expr do Statement 
 * Compound ::= begin Statement; ...; Statement end
 */

public class Main{
    public static void main(String [] args){
        Statement factorial = new Compound(new Compound(
            new Assignment(
                "fact", new Expression()), new While(
                    new Expression(), new Compound(
                        new Assignment(
                            "fact", new Expression()), new Assignment(
                                "n", new Expression())))), new Conditional(
                                    new Expression(), new Assignment(
                                        "test1", new Expression()),
                                    new Assignment(
                                        "test2", new Expression())));
        factorial.print(0);
    }
}