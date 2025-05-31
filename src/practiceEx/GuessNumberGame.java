package practiceEx;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

        int guess;
        int ans = 1;
        Random random = new Random();
        do {
            int myNumber = random.nextInt(100)+1;
            System.out.println("System has selected one number between 1 to 100 and you have to Guess that Number..Let's the fun begin :)");
            System.out.println("Enter you guess ..!");

            Scanner scanner = new Scanner(System.in);
            do {
                guess = scanner.nextInt();
                if (guess < 0 || guess > 100) {
                    System.out.println("Please select from 1 to 100");
                } else if (guess == myNumber) {
                    System.out.println("Your guess is correct..!");
                } else if (guess < myNumber) {
                    System.out.println("your guess is too low..");
                } else {
                    System.out.println("your guess it too high..");
                }
            } while (guess != myNumber);
            System.out.println("You want to guess again.? 0. to exit 1. to Continue.. ");
            if (ans == 0) {
                System.exit(0);
                System.out.println("Thank you for Playing.! Hope you Enjoyed :)");
            } else {
                ans = scanner.nextInt();
            }
        }while (ans == 1);
    }
}
