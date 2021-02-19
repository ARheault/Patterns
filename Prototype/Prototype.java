import pattpack.account.*;

/**
 * This is my implementation of the prototype to work with the type account
 */
public class Prototype {
    // A prototype should hold an abstract object of each product
    private AccountIF accountType;
    private SecurityManagerIF securityManagerType;

    /**
     * This is the constructor with arguments. When a new object is created it sets
     * the values to the respective parameters.
     * 
     * @param accountType         This takes the type of account as an argument and
     *                            sets the abstract product to the concrete product.
     * @param securityManagerType This does the same thing, but for the security
     *                            manager.
     */
    Prototype(AccountIF accountType, SecurityManagerIF securityManagerType) {
        this.accountType = accountType;
        this.securityManagerType = securityManagerType;
    }

    /**
     * This function is for changing the family of the prototype. It does
     * essentially the same thing a builder would do, but is able to access its
     * private data members itself.
     * 
     * @param loginId This is the login ID that is meant to check for which type of
     *                account it is.
     * @return It returns itself after the change is made. Redudant change so that a
     *         front end developer who might not be me will have flexibility.
     */
    public Prototype changeFamily(int loginId) {
        // Check if it is in the range of economy
        if (loginId > Properties.economyLow && loginId < Properties.economyHigh) {
            this.accountType = new AccountEconomy(loginId);
            this.securityManagerType = new SecurityManagerEconomy();
        } else { // otherwise check if it is in standard range
            if (loginId > Properties.standardLow && loginId < Properties.standardHigh) {
                this.accountType = new AccountStandard(loginId);
                this.securityManagerType = new SecurityManagerStandard();
            } else { // lastly check if it is inprofessonal range
                if (loginId > Properties.professionalLow && loginId < Properties.professionalHigh) {
                    this.accountType = new AccountStandard(loginId);
                    this.securityManagerType = new SecurityManagerStandard();
                } else { // if nothing else it's an error
                    System.err.println(
                            "Invalid input! Id range is " + Properties.lowestID + " to " + Properties.highestID);
                }
            }
        }
        return this; // Return itself after making the needed changes
    }

    /**
     * This function creates the user for the Client.
     * @return Returns the User that is creates based on the concrete products selected.
     */
    public User makeUser() {
        if (accountType != null && securityManagerType != null) {
            return new User(accountType, securityManagerType);
        } else { // In the case that they have not yet picked the products
            System.err.println("Error: No account and security type specififed when trying to create user!");
            return null;
        }
    }
}
