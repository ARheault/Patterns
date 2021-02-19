import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorIF theCalc = new Calculator();
            Naming.rebind("Calculator", theCalc);
            System.out.println("Server up!");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}