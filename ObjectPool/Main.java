import java.util.Random;
/*
    Alexander Rheault
    Object Pool
*/

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        // 97-122 For lowercase characters
        Random rand = new Random(); // To test new things everytime

        for (int i = 0; i < 100; ++i) {
            int randomNum = rand.nextInt(25) + 97;
            int which = rand.nextInt(2);
            // Add and remove at random.
            if (which == 1) {
                myList.insert(String.valueOf((char) randomNum)); // Convert each random lowercase into a string.
            } else {
                // Because the input is random as well it is possible it will pick a character
                // that isn't in the list and will just skip doing an operation.
                myList.remove(String.valueOf((char) randomNum));
            }
        }
        myList.print(); // Print the results
    }
}