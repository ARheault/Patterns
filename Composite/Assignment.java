public class Assignment {
    private String theAssignment;

    Assignment(String assignTo, String toAssign) {
        this.theAssignment = assignTo + " := " + toAssign;
    }

    public String getTheString() {
        return theAssignment;
    }
}