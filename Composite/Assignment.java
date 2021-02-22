public class Assignment implements Statement {
    private String assignTo;
    private Statement toAssign;

    Assignment(String assignTo, Statement toAssign) {
        this.assignTo = assignTo;
        this.toAssign = toAssign;
    }

    public void print(int indent) {
        for(int i = 0; i < indent; i++){
            System.out.print("\t");
        }
        System.out.print(assignTo + " := ");
        toAssign.print(indent);
    }
}