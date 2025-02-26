import java.util.Scanner;

public class Challenge01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// user entering their name.
		System.out.print("Please enter your name: ");
		String nameInput = input.nextLine();

		// user entering their age.
		System.out.print("Please enter your age: ");
		int ageInput = input.nextInt();

			 	while (ageInput < 0) {

			 		System.out.print("Wrong input, please enter a correct number: ");
			 		ageInput = input.nextInt();

			 	} if (ageInput >= 18) {
			 		
			 		System.out.println("You are above the age limit, and you are allowed to vote, please go to your voting booth.");
			 	
			 	} else if (ageInput <= 17 && ageInput >= 0) {
			 	
			 	System.out.println("You are under age, and you are not allowed to vote just yet.");
			}

		// thank you message 
		System.out.println("Thank you for using the software, I hope that you have a good day.");
		// closing scanner
		input.close(); 
		}
	} 

