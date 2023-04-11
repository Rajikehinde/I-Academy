package Assignment;

import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {

        int number, remainder, number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = scan.nextInt();

        System.out.println("Enter your second number: ");
        number2 = scan.nextInt();

        int reservedNumber = number;

        remainder = number % number2;
        number = number / number2;
        System.out.printf("The remainder of two integers is %d \nThe quotient of two integers is %d \n", remainder, number);
        while (reservedNumber > 0)
        {
            remainder = reservedNumber % number2;
            reservedNumber = reservedNumber / number2;
            System.out.print(" " + remainder);
        }
    }
}
