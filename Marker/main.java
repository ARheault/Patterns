import java.rmi.*;

class Main {
    private static final String name = "Calculator";

    public static void main(String[] args) {
        try {
            CalculatorIF theCalc = (CalculatorIF) Naming.lookup(name);
            System.out.println("1 + 2 = " + theCalc.add(1, 2));
        } catch (Exception e) {
            System.err.println("Exception in the client: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
