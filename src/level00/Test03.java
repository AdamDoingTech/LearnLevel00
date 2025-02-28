import java.util.Scanner;


public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scans user input
        System.out.print("Please enter a word to be tested for vowels: "); // ask the user for input
        String wordInput = input.next(); // takes the user input as a String.

        int vowelsCounter = 0;
        for (int i = 0; i < wordInput.length(); i++) {
            char wordLetter = wordInput.charAt(i);

            switch (wordLetter) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                vowelsCounter++; // increase the vowelsCounter by +1
            }
        }
        // print statement
        System.out.println("The word " + wordInput + " has " + vowelsCounter + " vowels.");
        
        // closing scanner 
        input.close();
    }
}