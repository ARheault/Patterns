import java.util.*;
import pattpack.account.*;

class Main {
    public static void main(String[] ignore) { // Standard entry
        System.out.print(
                "Please enter an account loginID, 0-1999 for economy, 2000-3999 for standard, and 4000-5999 for professional:");
        Scanner in = new Scanner(System.in); // Read in the loginID
        int loginId = in.nextInt();
        Prototype thePrototype = null;
        while(thePrototype == null){
            thePrototype = Builder.build(loginId); // Build based on input and make sure that they have to build something correctly.
        }
        System.out.println(thePrototype); // Show them the prototype that is created
        User aUser = thePrototype.makeUser(); // Build a user
        System.out.println(aUser); // Print the user
        in.close(); // Because memory matters
    }
}