import java.rmi.*;

public class Proxy {

    private static final String name = "Calculator";
    private CalculatorIF theCalc;


    Proxy() {
        try {
            theCalc = (CalculatorIF) Naming.lookup(name);
        } catch (Exception e) {
            System.err.println("Exception in the Proxy: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public int add(int x, int y) throws RemoteException {
        return theCalc.add(x, y);
    }

    public int sub(int x, int y) throws RemoteException {
        return theCalc.sub(x, y);
    }

    public float mul(int x, int y) throws RemoteException {
        return theCalc.mul(x, y);
    }

    public float div(int x, int y) throws RemoteException {
        return theCalc.div(x, y);
    }
}