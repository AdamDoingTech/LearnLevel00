import java.util.Arrays;

public class Practice01 {
	public static void main(String[] args)  {
		int num = 1;
		double numDouble = 2.0;
		char letter = 'C';
		boolean bool = true;

		int resultsOne = num * 2;
		int resultsTwo = num - 1;
		int resultsThree = num + 1;
		int resultsFour = num / 1;
		int resultsFive = num % 1; // I have no idea what is this and how it works, if you can explain it to me.

		int resultsSix = num++;
		int resultsSeven = num--;

		boolean compareTwoVars = resultsOne > resultsTwo;

		int castedNum = (int) numDouble;

		int[] resultsArray = {resultsOne, resultsTwo, resultsThree, resultsFour, resultsFive, resultsSix, resultsSeven};

		System.out.println("Those are all the results for the challenge: " + resultsOne + resultsTwo + resultsThree + resultsFour + resultsFive + resultsSix + resultsSeven);

		// printing results array, to compare the answer above, as wel talked about just now. 
		System.out.println("Results from resultsArray" + Arrays.toString(resultsArray));

		// the primitive data types, which I hope you can quize me on them at some point.
		System.out.println("Those are the variables or the primitive data types you wanted me to print: " + num + numDouble + letter + bool);

		// this is the casting, we talked about [so far my fav part, because I kind of figured this one on my own, so please empower to figure things on my own].
		System.out.println("This is the explict casting, where you force it to happen: " + castedNum);
	}
}