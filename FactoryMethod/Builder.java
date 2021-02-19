public class Builder {
    /**
     * This method is used to build the concrete factory so that the user doesn't
     * have to see the implementation.
     * 
     * @param loginId Represents the loginID of the user.
     * @return
     */
    public static FactoryIF build(int loginId) {
        // For this I will use the same numbers used by the professor.
        if (loginId > 0 && loginId < 1999) {
            return new FactoryEconomy();
        }
        /*
         * else{ if(loginId > 1999 && loginId < 3999){ return new FactoryStandard(); }
         * else{ if(loginId > 3999 && loginId < 5999){ return new FactoryProfessional();
         * }
         */
        else {
            System.err.println("Invalid input!");
            return null;
        }
        /*
         * } }
         */
    }
}
