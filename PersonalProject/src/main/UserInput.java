package main;

import java.util.Scanner;

/**
 * UserInput Class is used for scanning input from the keyboard to be saved in a variable.
 */
public class UserInput {
    public static Scanner input=new Scanner(System.in);
    public static String strInput;
    public static int intInput;

    /**
     *This method will save everything inputted by the user as a string.
     * @return a string entered by the user
     */

    public static String stringInput(){
        strInput=input.nextLine().trim();
        return strInput;
    }

    /**
     * This method will return 0 to the caller if the user tries to enter an invalid input.
     * @return an integer entered by the user
     *
     */
    public static int integerInput() {
        try {
            intInput = input.nextInt();
            return intInput;
        }catch (Exception e) {
            System.out.println("Wrong Input!");
            return 0;
        }

    }
}
