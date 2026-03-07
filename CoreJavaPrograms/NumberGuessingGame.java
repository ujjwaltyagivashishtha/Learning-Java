// Create a number guessing game where the program selects a random number, and the user has to guess it.

public class NumberGuessingGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;

        while (userGuess != randomNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = new java.util.Scanner(System.in).nextInt();
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
            }
        }
    }
}
