import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This defines the repeat variable to be used later.
        boolean repeat = true;
        //This creates a new scanner system.
            Scanner sc = new Scanner(System.in);
            //This asks the user to input their desired string.
            System.out.println("What would you like the starting string to be?");
            //This defines their input as the starting string.
            String startingString = sc.nextLine();
            //This starts the repeat, executing the following when the repeat is true.
            while (repeat) {
                //This prints out the menu for the user to choose from.
            System.out.println("Pick an action to execute:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains substring\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit");
            //This defines their input as their choice from the menu.
            int choice = sc.nextInt();
            //This clears the rest of the line to continue the program.
            sc.nextLine();
            //This executes the following if their choice is 1.
            if (choice == 1) {
                //This executes the method "optionOne" and redefines the starting string if the above is true.
                startingString = optionOne(startingString, sc);
                //This executes the following if their choice is 2.
            } else if (choice == 2) {
                //This executes the method "optionTwo" if the above is true.
                optionTwo(startingString, sc);
                //This executes the following if their choice is 3.
            } else if (choice == 3) {
                //This executes the method "optionThree" if the above is true.
                optionThree(startingString);
                //This executes the following if their choice is 4.
            } else if (choice == 4) {
                //This executes the method "optionFour" if the above is true.
                optionFour(startingString, sc);
                //This executes the following if their choice is 5.
            } else if (choice == 5) {
                //This executes the method "optionFive" if the above is true.
                optionFive(startingString, sc);
                //This executes the following if their choice is 6.
            } else if (choice == 6) {
                //This executes the method "optionSix" if the above is true.
                optionSix(startingString, sc);
                //This gives orders if all the other tests fail.
            } else {
                //This prints out a farewell message.
                System.out.println("Goodbye!");
                //This redefines the repeat variable as false, ending the program.
                repeat = false;
            }
        }
    }
    //This creates the method optionOne to be used if their choice was 1.
    public static String optionOne(String startingString, Scanner sc) {
        //This asks the user to input their addition.
        System.out.println("What would you like to add?");
        //This defines the variable "addition" as their addition.
        String addition = sc.nextLine();
        //This redefines the startingString variable as the original string with their addition.
        startingString = startingString + addition;
        //This outputs the new string to the user.
        System.out.println("Your current string is '" + startingString + "'.");
        //This returns the new starting string as the original starting string with the addition.
        return startingString;
    }
    //This creates the method optionTwo to be used if their choice was 2.
    public static void optionTwo(String startingString, Scanner sc) {
        //This asks the user to input their substring search.
        System.out.println("Substring:");
        //This defines their substring variable as their input.
        String substring = sc.nextLine();
        //This takes the index of the substring in relation to the starting string, finding the place in the string it's in.
        int indexOfSubstring = startingString.indexOf(substring);
        //This starts an "if" statement, saying to execute the following if the substring doesn't exist in the string.
        if (indexOfSubstring == -1) {
            //This outputs an error message to the user.
            System.out.println("I regret to inform you that your substring does not exist in the string.");
            //This starts an "else" statement, doing the following if the substring does exist.
        } else {
            //This prints out a success message to the user.
            System.out.println("Yay! Your substring exists in the string!");
        }
    }
    //This creates the method optionThree to be used if their choice was 3.
    public static void optionThree(String startingString) {
        //This takes the length of the starting string.
        int stringLength = startingString.length();
        //This outputs the length of the string.
        System.out.println("The length of your string is " + stringLength);
    }
    //This creates the method optionFour to be used if their choice was 4.
    public static void optionFour(String startingString, Scanner sc) {
        //This asks the user to input their desired prefix.
        System.out.println("Prefix:");
        //This defines their input as the string "prefixInput".
        String prefixInput = sc.nextLine();
        //This takes the length of the starting string.
        int stringLength = startingString.length();
        //This takes the length of their prefix input.
        int lengthOfPrefixInput = prefixInput.length();
        //This takes the index of the prefix in relation to the starting string, finding where it is.
        int indexOfPrefix = startingString.indexOf(prefixInput);
        //This defines the string "value" as the substring from the character after the end of the prefix to the end of the string.
        String value = startingString.substring(indexOfPrefix + lengthOfPrefixInput, stringLength);
        //This prints out the substring.
        System.out.println("The substring is " + value);
    }
    //This creates the method optionFive to be used if their choice was 5.
    public static void optionFive(String startingString, Scanner sc) {
        //This asks the user to input their desired suffix.
        System.out.println("Suffix:");
        //This defines their input as the string "suffixInput".
        String suffixInput = sc.nextLine();
        //This takes the index of the suffix input in relation to the starting string, finding where it is.
        int indexOfSuffix = startingString.indexOf(suffixInput);
        //This defines the string "value" as the substring from the 0th position in the starting string up to the start of their input.
        String value = startingString.substring(0, indexOfSuffix);
        //This prints out the substring.
        System.out.println("The substring is " + value);
    }
    //This creates the method optionSix to be used if their choice was 6.
    public static void optionSix(String startingString, Scanner sc) {
        //This asks the user to input their desired prefix.
        System.out.println("Prefix:");
        //This defines their input as the string "prefixInput".
        String prefixInput = sc.nextLine();
        //this asks the user to input their desired suffix.
        System.out.println("Suffix:");
        //This defines their input as the string "suffixInput".
        String suffixInput = sc.nextLine();
        //This takes the index of the suffix input in relation to the starting string, finding where it is.
        int indexOfSuffix = startingString.indexOf(suffixInput);
        //This takes the length of their prefix input.
        int lengthOfPrefixInput = prefixInput.length();
        //This takes the index of the prefix string in relation to the starting string, finding where it is.
        int indexOfPrefix = startingString.indexOf(prefixInput);
        //This defines the string "value" as the substring from the character after the prefix up to the first character in the suffix.
        String value = startingString.substring(indexOfPrefix + lengthOfPrefixInput, indexOfSuffix);
        //This prints out the substring.
        System.out.println("The substring is " + value);
    }
}
