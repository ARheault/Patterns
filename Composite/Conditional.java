public class Conditional implements Statement {
    private Statement condition;
    private Statement ifStatement;
    private Statement elseStatement;

    Conditional(Statement exp, Statement exp1, Statement exp2) {
        this.condition = exp;
        this.ifStatement = exp1;
        this.elseStatement = exp2;
    }

    public void print(int indent) {
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("If ");
        this.condition.print(indent+1);
        System.out.print("\n");
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("then\n");
        this.ifStatement.print(indent +1);
        System.out.print("\n");
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("else\n");
        this.elseStatement.print(indent +1);
        System.out.print("\n");
    }
}