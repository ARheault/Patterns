import java.rmi.RemoteException;
import java.rmi.server.*;

public class Calculator extends UnicastRemoteObject implements CalculatorIF {

    Calculator() throws RemoteException {}

    public int add(int x, int y) throws RemoteException {
        return x + y;
    }

    public int sub(int x, int y) throws RemoteException {
        return x - y;
    }

    public float mul(int x, int y) throws RemoteException {
        return (float) x * y;
    }

    public float div(int x, int y) throws RemoteException {
        return (float) x / y;
    }
}