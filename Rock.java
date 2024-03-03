import java.util.Random;
import java.util.Scanner;
import java.io.Console;

public class Rock {
	public static void main(String[] args) {
		// for random
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		String[] choices = { "R", "S", "P" };
		String randomChoices = choices[randomNumber];
		// variables
		String personPlay, secondPlayer, computerPlay;
		int computerInt;

		Console console = System.console();
		Scanner scan = new Scanner(System.in);
		// asking
		System.out.println("1. Single Player");
		System.out.println("2. Multiplayer");
		System.out.println("3. Exit");
		// taking input
		computerInt = scan.nextInt();
		switch (computerInt) // switch statement
		{
			case 1: // for single player
				System.out.println("Running single player\n");
				char[] entering = console.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
				personPlay = new String(entering).toUpperCase();
				computerPlay = randomChoices; // assigning the values to computerPlay
				// if-else condition
				if (computerPlay.equals(personPlay)) {
					System.out.println("It's a tie!");
				} else if (personPlay.equals("R")) {
					if (computerPlay.equals("S")) {
						System.out.println("Rock crushes scissors. You win!");
					} else if (computerPlay.equals("P")) {
						System.out.println("Paper covers Rock. Computer wins!");
					}
				} else if (personPlay.equals("P")) {
					if (computerPlay.equals("S")) {
						System.out.println("Scissors cuts Paper. Computer wins!");
					} else if (computerPlay.equals("R")) {
						System.out.println("Paper covers Rock. You win!");
					}
				} else if (personPlay.equals("S")) {
					if (computerPlay.equals("R")) {
						System.out.println("Rock crushes scissors. Computer wins!");
					} else if (computerPlay.equals("P")) {
						System.out.println("Scissors cuts Paper. You win!");
					}
				} else { // shows an invalid if user inputs other values.
					System.out.println("Invalid input. Please choose R, P, or S.");
				}

				break;
			case 2: // for multi player
				System.out.println("Running multiplayer\n");
				System.out.println("For 1st player");
				char[] enteringFristUser = console
						.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
				personPlay = new String(enteringFristUser).toUpperCase();
				System.out.println("For 2nd player");
				char[] enteringSecondUser = console
						.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
				secondPlayer = new String(enteringSecondUser).toUpperCase();
				// if-else condition
				if (secondPlayer.equals(personPlay)) {
					System.out.println("It's a tie!");
				} else if (personPlay.equals("R")) {
					if (secondPlayer.equals("S")) {
						System.out.println("Rock crushes scissors. First player wins!");
					} else if (secondPlayer.equals("P")) {
						System.out.println("Paper covers Rock. Second player wins!");
					}
				} else if (personPlay.equals("P")) {
					if (secondPlayer.equals("S")) {
						System.out.println("Scissors cuts Paper. Second player wins!");
					} else if (secondPlayer.equals("R")) {
						System.out.println("Paper covers Rock. First player wins!");
					}
				} else if (personPlay.equals("S")) {
					if (secondPlayer.equals("R")) {
						System.out.println("Rock crushes scissors. Second player wins!");
					} else if (secondPlayer.equals("P")) {
						System.out.println("Scissors cuts Paper. First player wins!");
					}
				} else {// throws an invalid input if user tries to enter other values.
					System.out.println("Invalid input. Please choose R, P, or S.");
				}
			case 3:
				break;
			default:
				break;
		}
		scan.close();
	}
}
