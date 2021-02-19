import pattpack.account.*;

public class AbstractFactoryStandard implements AbstractFactoryIF {
    /**
     * This is the interface for the account factories.
     */

     /**
      *  Allow the user to make the account of the type of account they have.
      * @param loginId
      * The loginId specifies the user's loginId that will be set when the account is created.
      * @return It returns the account that is created.
      */
    public AccountIF makeAccount(int loginId){ return new AccountStandard(loginId); }

    /**
     *  Allow the user to make the security manager of the type of account they have.
     * @return It returns the security manager that is created.
     */

    public SecurityManagerIF makeSecurityManager() { return new SecurityManagerStandard(); } 
}
