package level00;

import java.util.Scanner;

/**
 * TestOne Class
 * 
 * This class demonstrates basic input and output in Java.
 * It collects user input for an integer, a double, and a character.
 * Then, it performs various arithmetic operations, a boolean comparison,
 * and explicit type casting, displaying the results in the console.
 * 
 * @author: Adam
 * @since 2025-02-26
 */
public class TestOne {

    /**
     * Main method to execute the program.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer input
        System.out.print("Please input a number: ");
        int numInputOne = input.nextInt();

        // Prompt user for a double input
        System.out.print("Please input another number: ");
        double doubleInputTwo = input.nextDouble();

        // Prompt user for a character input
        System.out.print("Please input a word: ");
        char charInput = input.next().charAt(0);

        // Boolean comparison: checking if the two numbers are equal
        boolean boolResults = numInputOne == doubleInputTwo;

        // Arithmetic operations and print statements
        System.out.println("The results are as followed for +: " + (numInputOne + doubleInputTwo));
        System.out.println("The results are as followed for -: " + (numInputOne - doubleInputTwo));
        System.out.println("The results are as followed for *: " + (numInputOne * doubleInputTwo));
        System.out.println("The results are as followed for /: " + (doubleInputTwo / numInputOne));
        System.out.println("The results are as followed for %: " + (doubleInputTwo % numInputOne));

        // Boolean comparison print statement
        System.out.println("The results are as followed for == : " + boolResults);

        // Explicit type casting and print statements
        System.out.println("The results are as followed for the casting of a double into an int: " + (int) doubleInputTwo);
        System.out.println("The results are as followed for a char into an int: " + (int) charInput);

        // Closing Scanner in order to prevent resource leak
        input.close();
    }
}
