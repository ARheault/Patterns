public class While implements Statement {
    private Statement condition;
    private Statement body;

    While(Statement exp1, Statement exp2){
        this.condition = exp1;
        this.body = exp2;
    }

    public void print(int indent){
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print("While ");
        this.condition.print(indent);
        System.out.print(" do\n");
        this.body.print(indent + 1);
    }
}