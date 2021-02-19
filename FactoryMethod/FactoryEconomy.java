import pattpack.account.*;

public class FactoryEconomy extends FactoryIF {
    public AccountIF createAccount(int loginID) {
        return new AccountEconomy(loginID);
    }

    public SecurityManagerIF createSecurityManager() {
        return new SecurityManagerEconomy();
    }
}
