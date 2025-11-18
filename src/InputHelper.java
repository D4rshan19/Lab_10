import java.util.Scanner;
public class InputHelper {


    //getNonZeroLenString method returns a String of non-zero length back to user
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);
        do {

            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                }
                else {
                    System.out.println("Error, input must be between " + min + " and " + max + ".");
                }
            }
            else {
                System.out.println("Error, must enter string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }



    //The getInt method returns a valid int value back to the user
    public static int getInt(Scanner scan , String prompt) {
        boolean valid = false;
        int userInput =0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            }
            else {
                System.out.println("Error, must enter an integer value.");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }



    public static double getDouble(Scanner scan, double prompt) {
        boolean valid = false;
        double userInput =0;

        System.out.println(prompt);
        do {
            if(scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                valid = true;
            }
            else {
                System.out.println("Error, must enter a double [decimal] value.");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }



    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        boolean valid = false;
        double userInput = 0;

        System.out.println(prompt);
        do {

            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                }
                else {
                    System.out.println("Error, input must be between " + min + " and " + max + ".");
                }
            }
            else {
                System.out.println("Error, must enter string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }



    public static int getPositiveNonZeroInt(Scanner scan, int prompt) {
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);
        do {
            if(scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput > 0) {
                    valid = true;
                }
            }
            else {
                System.out.println("Error, must enter a double [decimal] value.");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }


    public static String getYNConfirm(Scanner scan , String prompt) {
        boolean valid = false;
        String userInput = "";

        System.out.println(prompt);
        do {
            if (scan.hasNextLine()) {
                userInput = scan.nextLine();
                if (userInput.equals("Y") || userInput.equals("y") || userInput.equals("N") || userInput.equals("n"))
                    valid = true;
            }
            else {
                System.out.println("Error, must enter either Y or N ");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    public static String getRegExString(Scanner scan, String prompt, String regExPattern){
        boolean valid = false;
        String userInput;


        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.matches(regExPattern)) {
                valid = true;
            }
            else {
                System.out.println("Error, must match specified pattern");
            }
        } while (!valid);
        return userInput;
    }
}

