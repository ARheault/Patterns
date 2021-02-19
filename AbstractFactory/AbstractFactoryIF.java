import pattpack.account.*;

public interface AbstractFactoryIF {
    /**
     * This is the interface for the account factories.
     */

     /**
      *  Allow the user to make the account of the type of account they have.
      * @param loginId
      * The loginId specifies the user's loginId that will be set when the account is created.
      * @return It returns the account that is created.
      */
    public AccountIF makeAccount(int loginId);

    /**
     *  Allow the user to make the security manager of the type of account they have.
     * @return It returns the security manager that is created.
     */

    public SecurityManagerIF makeSecurityManager();
}
