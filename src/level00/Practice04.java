

public class Practice04 {
    public static void main(String []args) {

        System.out.println("\nPrinting numbers from 1 to 10");
        for (int j = 0; j <= 10; j++) { // for loop to count from 1 to 10
            System.out.print(j + " "); // print statemnt 
        }

        System.out.println("\n\nPrinting numbers from 2 to 20");
        int i = 2; // variable
        while (i <= 20 && i % 2 == 0) { // while loop that prints numbers from 2 to 20 [can be divided by 2]
            System.out.print(i + " "); // print statement
            i += 2;
        }

        System.out.println("\n\nPrinting numbers from 10 to 0");
        int intG = 10;
        do { // do while loop to print numbers from 10 to 1
            System.out.print(intG + " ");
            intG--;
        } while (intG >= 0);
    }
}