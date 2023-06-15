import java.util.Scanner;

/**
 * Program asks user for their favorite city
 * Then manipulates the string the following ways:
 * - Print number of chars in string
 * - Print city in all CAPS
 * - Print city in all lowercase
 * - Print first char of the city
 * 
 * This is a project from Ch2 of the Starting Out with Java Textbook
 */

public class StartingOutStringManip {
    public static void main(String[] args) {
        
        // Create input object
        Scanner keyboard = new Scanner(System.in);

        // Asks user for their favorite city
        System.out.println("What is your favorite city? ");
        String city = keyboard.nextLine();

        // Finds number of characters in city
        int cityChars = city.length();
        System.out.println("There are " + cityChars + 
                           " characters in " + city + ".");

        // Converts the string to all caps
        System.out.println(city.toUpperCase());

        // Converts the string to all lowercase
        System.out.println(city.toLowerCase());

        // Prints the first letter of the city
        System.out.println(city.charAt(0));

        keyboard.close();
    }
}
