import pattpack.account.*;

public class Builder {
    /**
     * This method is used to put the correct products in the prototype so that the
     * user doesn't have to see the implementation.
     * 
     * @param loginId Represents the loginID of the user.
     * @return
     */
    public static Prototype build(int loginId) {
        // For this I will use the same numbers used by the professor.
        if (loginId > Properties.economyLow && loginId < Properties.economyHigh) {
            return new Prototype(new AccountEconomy(loginId), new SecurityManagerEconomy());
        } else {
            if (loginId > Properties.standardLow && loginId < Properties.standardHigh) {
                return new Prototype(new AccountStandard(loginId), new SecurityManagerStandard());
            } else {
                if (loginId > Properties.professionalLow && loginId < Properties.professionalHigh) {
                    return new Prototype(new AccountProfessional(loginId), new SecurityManagerProfessional());
                } else {
                    System.err.println("Invalid input!");
                    return null;
                }
            }
        }
    }
}