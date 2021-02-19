public class Builder {
    /**
     * This method is used to build the concrete factory so that the user doesn't have to see the implementation.
     * @param loginId Represents the loginID of the user.
     * @return
     */
    public static AbstractFactoryIF build(int loginId){
        // For this I will use the same numbers used by the professor.
        if(loginId > 0 && loginId < 1999){
            return new AbstractFactoryEconomy();
        }
        else{
            if(loginId > 1999 && loginId < 3999){
                return new AbstractFactoryStandard();
            }
            else{
                if(loginId > 3999 && loginId < 5999){
                    return new AbstractFactoryProfessional();
                }
                else{
                    System.err.println("Invalid input!");
                    return null;
                }
            }
        }
    }
}
