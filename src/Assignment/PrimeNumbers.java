package Assignment;

import java.util.Scanner;

public class PrimeNumbers {

    public static void PrimeNumberChecker(int number)
    {
        int count=0;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        number = scan.nextInt();

        for (int i = 1; i <= number; i++)
        {
            if(number % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println(number + " is a prime number");
        }
//        else
//        {
//            System.out.println("Not a prime number");
//        }
    }
    public static void primeNo()
    {
        for (int i = 2; i <= 10000; i++) {
            PrimeNumberChecker(i);
        }
    }
    public static void main(String[] args) {
        primeNo();
    }
}
