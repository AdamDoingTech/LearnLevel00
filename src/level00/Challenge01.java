package level00;

import java.util.Scanner;

/**
 * Challenge01 Class
 * 
 * This class demonstrates a simple voting eligibility checker.
 * It prompts the user for their name and age, then checks if the user is 
 * eligible to vote based on their age. It also handles invalid inputs 
 * by looping until a positive number is entered for the age.
 * 
 * Key Features:
 * - Uses Scanner for user input.
 * - Implements a while loop to handle invalid inputs.
 * - Checks age eligibility for voting:
 *     - 18 or older: Allowed to vote.
 *     - Under 18: Not allowed to vote.
 *     - Negative age: Prompts the user to re-enter a valid age.
 * 
 * @author: AdamDoingTech
 * @since: 2025-02-25
 */
public class Challenge01 {

    /**
     * Main method to execute the program.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for name input
        System.out.print("Please enter your name: ");
        String nameInput = input.nextLine();

        // Prompt user for age input
        System.out.print("Please enter your age: ");
        int ageInput = input.nextInt();

        // Loop to validate age input: Ensures age is not negative
        while (ageInput < 0) {
            System.out.print("Invalid input. Age cannot be negative. Please enter a valid age: ");
            ageInput = input.nextInt();
        }

        // Check voting eligibility based on age
        if (ageInput >= 18) {
            // Age is 18 or above: Eligible to vote
            System.out.println("You are above the age limit, and you are allowed to vote. Please proceed to your voting booth.");
        } else if (ageInput <= 17 && ageInput >= 0) {
            // Age is under 18 but positive: Not eligible to vote
            System.out.println("You are under the age limit, and you are not allowed to vote just yet.");
        }

        // Thank you message at the end, to the user
        System.out.println("Thank you for using the software. Have a great day!");

        // Closing Scanner to prevent resource leak
        input.close();
    }
}
