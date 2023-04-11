package Assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int playersNumber = random.nextInt(28);
        System.out.println(playersNumber);
        Scanner scam = new Scanner(System.in);
        int attempt = 1;
        while (attempt < 4)
        {
            System.out.println("Enter any number: ");
            int guessNumber = scam.nextInt();

            if (guessNumber == playersNumber)
            {
                System.out.println("Congratulation!🎉 you get the number");
                break;
            } else if (guessNumber < playersNumber) {
                System.out.println("Too low! 😢 try again");
            }
            else
            {
                System.out.println("Too high!😢 try again");
            }
            attempt++;
        }
        if (attempt == 4)
        {
            System.out.println("Game over! do you wish to play again or stop?");
        }
    }
}
