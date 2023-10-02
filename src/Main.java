import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
            Scanner sc = new Scanner(System.in);
            System.out.println("What would you like the starting string to be?");
            String startingString = sc.nextLine();
            while (repeat == true) {
            System.out.println("Pick an action to execute:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains substring\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                optionOne(startingString, sc);
            } else if (choice == 2) {
                optionTwo(startingString, sc);
            } else if (choice == 3) {
                optionThree(startingString);
            } else if (choice == 4) {
                optionFour(startingString, sc);
            } else if (choice == 5) {
                optionFive(startingString, sc);
            } else if (choice == 6) {
                optionSix(startingString, sc);
            } else {
                System.out.println("Goodbye!");
                repeat = false;
            }

        }
    }
    public static void optionOne(String startingString, Scanner sc) {
        System.out.println("What would you like to add?");
        String addition = sc.nextLine();
        startingString = startingString + addition;
        System.out.println("Your current string is '" + startingString + "'.");
    }

    public static void optionTwo(String startingString, Scanner sc) {
        System.out.println("Substring:");
        String substring = sc.nextLine();
        int indexOfSubstring = startingString.indexOf(substring);
        if (indexOfSubstring == -1) {
            System.out.println("I regret to inform you that your substring does not exist in the string.");
        } else {
            System.out.println("Yay! Your substring exists in the string!");
        }
    }
    public static void optionThree(String startingString) {
        int stringLength = startingString.length();
        System.out.println("The length of your string is " + stringLength);
    }
    public static void optionFour(String startingString, Scanner sc) {
        //This asks the user to input their desired prefix.
        System.out.println("Prefix:");
        //This defines their input as the string "prefix".
        String prefixInput = sc.nextLine();
        int stringLength = startingString.length();
        int lengthOfPrefixInput = prefixInput.length();
        char prefix = prefixInput.charAt(lengthOfPrefixInput - 1);
        int indexOfPrefix = startingString.indexOf(prefix);
        String value = startingString.substring(indexOfPrefix + 1, stringLength);
        System.out.println("The substring is " + value);
    }
    public static void optionFive(String startingString, Scanner sc) {
        System.out.println("Suffix:");
        String suffixInput = sc.nextLine();
        int indexOfSuffix = startingString.indexOf(suffixInput);
        String value = startingString.substring(0, indexOfSuffix);
        System.out.println("The substring is " + value);
    }
    public static void optionSix(String startingString, Scanner sc) {
        System.out.println("Prefix:");
        String prefixInput = sc.nextLine();
        System.out.println("Suffix:");
        String suffixInput = sc.nextLine();
        int indexOfSuffix = startingString.indexOf(suffixInput);
        int lengthOfPrefixInput = prefixInput.length();
        char prefix = prefixInput.charAt(lengthOfPrefixInput - 1);
        int indexOfPrefix = startingString.indexOf(prefix);
        String value = startingString.substring(indexOfPrefix + 1, indexOfSuffix);
        System.out.println("The substring is " + value);
    }
}
