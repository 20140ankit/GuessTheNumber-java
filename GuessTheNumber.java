import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100); // 1 to 100
        int numberOfTries = 0;
        int guess =0;

        System.out.println("Welcome to the Guess The Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Correct! You guesswd it in" + numberOfTries + "Tries.");
            }
        }

        scanner.close();
    }
}