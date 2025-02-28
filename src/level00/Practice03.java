import java.util.Scanner;

/**
 * Practice03 is a playground for Switch cases in Java
 * 
 * @author me
 * @since 2025
 **/

public class Practice03 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in); // Scanner for user input
        System.out.print("Please enter a number between 1 to 5: "); // asking user for input
        int numInput = input.nextInt(); // asking the user for an int

        switch (numInput) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2: 
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid number Input");
                break;
        }
        // closing scanner
        input.close();
    }
}