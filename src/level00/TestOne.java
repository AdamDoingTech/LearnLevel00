import java.util.Scanner;

public class TestOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please input a number: ");
		int numInputOne = input.nextInt();

		System.out.print("Please input another number: ");
		double doubleInputTwo = input.nextDouble();

		System.out.print("Please input a word: ");
		char charInput = input.next().charAt(0);

		// boolean comparison.
		boolean boolResults = numInputOne == doubleInputTwo;

		// print statements.
		System.out.println("The results are as followed for +: " + (numInputOne + doubleInputTwo));
		System.out.println("The results are as followed for -: " + (numInputOne - doubleInputTwo));
		System.out.println("The results are as followed for *: " + (numInputOne * doubleInputTwo));
		System.out.println("The results are as followed for /: " + (doubleInputTwo / numInputOne));
		System.out.println("The results are as followed for %: " + (doubleInputTwo % numInputOne));
		System.out.println("The results are as followed for == : " + boolResults);

		// casting print statements.
		System.out.println("The results are as followed for the casting of a double into an int: " + (int) doubleInputTwo);
		System.out.println("The results are as followed for a char into an int: " + (int) charInput);

	}
}