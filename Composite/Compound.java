public class Compound{
    private String theCompound;

    Compound(String exp1, String exp2) {
        this.theCompound = "begin\n" + exp1 + "end\n";
    }

    public String getTheString() {
        return theCompound;
    }
}

