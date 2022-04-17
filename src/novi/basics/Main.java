package novi.basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Take three numbers from the user and print the greatest
        // Tekst Data:
        // Input the 1st number: 25
        // Input the 2nd number: 78
        // Input the 3rd number: 87

        Scanner input = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int number1 = input.nextInt();

        System.out.println("Input the 2nd number: ");
        int number2 = input.nextInt();

        System.out.println("Input the3rd number: ");
        int number3 = input.nextInt();

        if (number1 > number2)
            if (number1 > number3)
                System.out.println("The greatest number " + number1);

        if (number2 > number1)
            if (number2 > number3)
                System.out.println("The greatest number " + number2);

        if (number3 > number1)
            if (number3 > number2)
                System.out.println("The greatest number " + number3);

    }
}
