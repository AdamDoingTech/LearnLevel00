// package level00;
import java.util.Scanner;

/**
 * Practice02: Is a practice playground for If Else, and Switch Statements for Java.
 * 
 * @author Adam
 * @since 2025
 */
public class Practice02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a scanner object
        System.out.print("Please enter a valid number: "); // Asking user for input
        int numInput = input.nextInt(); // Taking user input

        // if statement checking the user input if it is positive or negative and even or odd
        if (numInput == 0) { 
            System.out.println("Zero entered.");
        } else if (numInput > 0 && numInput % 2 == 0) {
            System.out.println("Positive even number entered.");
        } else if (numInput < 0) {
            System.out.println("Negative number entered.");
        } else {
            System.out.println("Positive odd number entered.");
        }
        // closing scanner
        input.close();
    }
}