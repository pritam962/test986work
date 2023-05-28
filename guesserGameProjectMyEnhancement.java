import java.util.Random;
import java.util.Scanner;

	public class guesserGameProjectMyEnhancement {
	    public static void main(String[] args) {
	        Random random = new Random();
	        int number = random.nextInt(100) + 1; // Generates a random number between 1 and 100

	        System.out.println("Welcome to the Guesser Game!");
	        System.out.println("I'm thinking of a number between 1 and 100.");

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of players: ");
	        int numPlayers = scanner.nextInt();

	        String[] players = new String[numPlayers];
	        int[] guesses = new int[numPlayers];

	        // Player registration
	        for (int i = 0; i < numPlayers; i++) {
	            System.out.print("Enter the name of player " + (i + 1) + ": ");
	            players[i] = scanner.next();
	        }

	        int attempts = 0;
	        boolean guessedCorrectly = false;
	        int currentPlayer = 0;

	        while (!guessedCorrectly) {
	            System.out.println(players[currentPlayer] + ", it's your turn to guess.");

	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            guesses[currentPlayer] = guess;
	            attempts++;

	            if (guess == number) {
	                guessedCorrectly = true;
	                System.out.println("Congratulations, " + players[currentPlayer] + "! You guessed the correct number in " + attempts + " attempts.");
	            } else if (guess < number) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }

	            currentPlayer = (currentPlayer + 1) % numPlayers; // Move to the next player
	        }

	        // Determine the winner
	        int minDifference = Math.abs(guesses[0] - number);
	        int winnerIndex = 0;

	        for (int i = 1; i < numPlayers; i++) {
	            int difference = Math.abs(guesses[i] - number);
	            if (difference < minDifference) {
	                minDifference = difference;
	                winnerIndex = i;
	            }
	        }

	        System.out.println("The correct number was: " + number);
	        System.out.println("The winner is: " + players[winnerIndex]);

	        scanner.close();
	    }
	}
