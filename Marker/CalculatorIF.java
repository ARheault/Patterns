import java.rmi.*;

public interface CalculatorIF extends Remote {
    public int add(int x, int y) throws RemoteException;

    public int sub(int x, int y) throws RemoteException;

    public float mul(int x, int y) throws RemoteException;

    public float div(int x, int y) throws RemoteException;
}