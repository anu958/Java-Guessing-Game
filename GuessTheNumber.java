import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
        
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > generatedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + attempts + " attempts to guess the number.");
            }
        }
        
        scanner.close();
    }
}