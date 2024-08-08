import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    private static final int min = 1;
    private static final int max = 100;
    private static final int max_attempts = 10;
    private static final int max_rounds = 2;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!!!");
        System.out.println("Total number of rounds : 2");
        System.out.println("Attempts to guess number in each round : 10\n");
        for (int i = 1; i <=max_rounds; i++) {
            int number = random.nextInt(min,max);
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, min,max,max_attempts);
            while (attempts < max_attempts) {
                System.out.println("Enter your guess : ");
                int guess_number = scanner.nextInt();
                attempts = attempts + 1;

                if (guess_number == number) {
                    int score = max_attempts - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("Congratulations! Number Guessed Successfully. ",attempts, score);
                    break;
                }

                else if (guess_number < number) {
                    System.out.printf("Too low! Try again.", guess_number,max_attempts - attempts);
                }

                else if (guess_number > number) {
                    System.out.printf("Too high! Try again.", guess_number,max_attempts - attempts);
                }

            }

            if (attempts == max_attempts) {
                System.out.printf("\nRound = ", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number is", number);
            }
        }
        System.out.printf(" Thank you for playing Game!!.  Game Over", totalScore);
        scanner.close();
    }
   
}