import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scan for user input
        System.out.println("Please enter a letter to check if it is a vowel or not: "); // asking for user input
        String stringInput = input.next(); // asking user for int input
        char charInput = stringInput.charAt(0); // making sure to take only the firt letter.

        // check if the letter entered is a vowel or not
        switch (charInput) {
            case 'a', 'A':
                System.out.println("A vowel");
                break;

            case 'e', 'E':
                System.out.println("A vowel");
                break;

            case 'i', 'I':
                System.out.println("A vowel");
                break;

            case 'o', 'O':
                System.out.println("A vowel");
                break;

            case 'u', 'U':
                System.out.println("A vowel");
                break;

            default: 
                System.out.println("Not a vowel");
        }

        // closing scanner 
        input.close();
    }
}