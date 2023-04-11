package Assignment;

import java.util.Scanner;

public class PerfectNumbers {

    public static void IsPerfect(int number)
    {
        int sum=0;
        //Scanner scan = new Scanner(System.in);
       // System.out.println("Enter a number: ");
       // number = scan.nextInt();

        for (int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                sum+=i;
            }
        }
        if (number == sum)
        {
            System.out.println("Perfect number is " + number);
        }
//        else
//        {
//            System.out.println("Not a perfect number");
//        }
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++)
        {
            IsPerfect(i);
        }
        IsPerfect(6);

    }
}
