import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the starting string to be?");
        String startingString = sc.nextLine();
        int stringLength = startingString.length();
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
            System.out.println("What would you like to add?");
            String addition = sc.nextLine();
            String newString = startingString + addition;
            System.out.println("Your current string is '" + newString + "'.");
            startingString = newString;
        } else if (choice == 2) {
            //make this do something
        } else if (choice == 3) {
            System.out.println(stringLength);
        } else if (choice == 4) {
            //This asks the user to input their desired prefix.
            System.out.println("Prefix:");
            //This defines their input as the string "prefix".
            String prefixInput = sc.nextLine();
            int lengthOfPrefixInput = prefixInput.length();
                char prefix = prefixInput.charAt(lengthOfPrefixInput - 1);
                //This takes the index of the input prefix and defines it.
                int indexOfPrefix = startingString.indexOf(prefix);
                //This defines "containsValue"
                String containsValue = startingString.substring(indexOfPrefix);
                String value = containsValue.substring(indexOfPrefix, stringLength - 1);
                System.out.println(value);
                //Make this do something
                //int startOfValue = logMessage.indexOf("value=");
                //String containsValue = logMessage.substring(startOfValue); //value=5;day=Tuesday;
                //int equalsSignIndex = containsValue.indexOf('='); //5
                //int semicolonIndex = containsValue.indexOf(';'); //7
                //String value = containsValue.substring(equalsSignIndex + 1, semicolonIndex); //5
                //between the fifth and seventh characters (= and ;), it gets the stuff between the two characters, which is the number 5.
                //System.out.println(Integer.parseInt(value));
            }
        } //else if (choice == 5) {
           // System.out.println("Suffix:");
           // String suffix = sc.nextLine();
            //make this do something
       // } else if (choice == 6) {
         //   System.out.println("Prefix:");
        //    String prefix = sc.nextLine();
        //    System.out.println("Suffix:");
        //    String suffix = sc.nextLine();
        }
        //}
  //  }