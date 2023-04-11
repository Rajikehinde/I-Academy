package Assignment;

import java.util.Scanner;

public class ReversingDigits {

    public static void main(String[] args) {
        int number, reverse=0, remainder;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        int reserveNumber = number;

        while (number > 0)
        {
            remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reverse of a number is " + reverse);
    }
}
