import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int num = rand.nextInt(101);
        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();
        do {
            if (guess > num) {
                System.out.println("Too high! Try again. ");
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
            }
            else if (guess < num) {
                System.out.println("Too low! Try again. ");
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
            }
        } while (num != guess);
        System.out.print("You got it!");
        // TODO: Prompt the user with a welcome message
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
