public class Conditional{
    private String theConditional;

    Conditional(String exp, String statement1, String statement2) {
        theConditional = "if " + exp + " then " + statement1 + " else " + statement2;
    }

    public String getTheString() {
        return theConditional;
    }
}