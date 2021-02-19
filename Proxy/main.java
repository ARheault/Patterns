import java.rmi.*;

class Main {
    private static final String name = "Calculator";

    public static void main(String[] args) throws RemoteException {
        Proxy aProxy = new Proxy();
        System.out.println("1 + 2 = " + aProxy.add(1, 2));
    }
}
