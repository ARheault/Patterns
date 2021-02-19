import pattpack.account.*;

public abstract class FactoryIF {
    public abstract AccountIF createAccount(int loginID);

    public abstract SecurityManagerIF createSecurityManager();

    public User createUser(int loginID){
        return new User(createAccount(loginID), createSecurityManager());
    }
}
