public class Compound implements Statement {
    private Statement Statement1;
    private Statement Statement2;

    Compound(Statement exp1, Statement exp2) {
        this.Statement1 = exp1;
        this.Statement2 = exp2;
    }

    public void print(int indent) {
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("begin\n");
        Statement1.print(indent + 1);
        System.out.print("\n");
        Statement2.print(indent + 1);
        System.out.print("\n");
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("end");
    }
}