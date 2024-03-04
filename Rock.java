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
		String secondPlayer="", personPlay ="", personPlay1 = ""; // initalizing the variables outside of the while loop.
		int computerInt;
		boolean inValidInput = false;
		boolean invalidInput1 = false;

		Console console = System.console();
		Scanner scan = new Scanner(System.in);
		// asking
		System.out.println("1. Single Player");
		System.out.println("2. Multiplayer");
		System.out.println("3. Exit");
		// taking input
		while (true) { // infinite loop until it satisfy the statement.
			System.out.println("Enter an number (1 to 3): ");
			String computer = scan.next();
			// exception handling
			try {
				int i = Integer.parseInt(computer);// changing String to Int
				if (i > 0 && i < 4) {
					computerInt = i;
					break;
				} else {
					System.out.println("Invalid Input!\n Enter valid Input: ");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input!!");
			}
		}
		switch (computerInt) // switch statement
		{
			case 1: // for single player
				System.out.println("Running single player\n");
				while (!inValidInput) {
					char[] entering = console
							.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
					personPlay1 = new String(entering).toUpperCase();
					try {
						for (int j = 0; j < choices.length; j++) {// for loop to check if the array have same values or
																	// not.
							if (personPlay1.equals(choices[j])) {
								inValidInput = true;
								// if the values are matched then it throws true and break the statement.
								break;
							}
						}
					} catch (Exception e) {
						System.out.println("Enter the correct values: ");
						continue;
					}
				}

				String computerPlay = randomChoices; // assigning the values to computerPlay
				// if-else condition
				if (computerPlay.equals(personPlay1)) {
					System.out.println("It's a tie!");
				} else if (personPlay1.equals("R")) {
					if (computerPlay.equals("S")) {
						System.out.println("Rock crushes scissors. You win!");
					} else if (computerPlay.equals("P")) {
						System.out.println("Paper covers Rock. Computer wins!");
					}
				} else if (personPlay1.equals("P")) {
					if (computerPlay.equals("S")) {
						System.out.println("Scissors cuts Paper. Computer wins!");
					} else if (computerPlay.equals("R")) {
						System.out.println("Paper covers Rock. You win!");
					}
				} else if (personPlay1.equals("S")) {
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
				while(!invalidInput1){
					try{
					char[] enteringFristUser = console.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
					personPlay = new String(enteringFristUser).toUpperCase();
					for(int k =0;k<choices.length;k++){
						if (personPlay.equals(choices[k])) {
							invalidInput1 = true;
							break;
						}
					}}catch(Exception e){
						System.out.println("Enter the correct values: ");
						continue;
					}
				}
				System.out.println("For 2nd player");
				while (!inValidInput) {
					try{
					char[] enteringSecondUser = console.readPassword("Choose ('R' for Rock, 'S' for Scissor, or 'P' for Paper): ");
					secondPlayer = new String(enteringSecondUser).toUpperCase();
					for(int l=0;l<choices.length;l++){
						if (secondPlayer.equals(choices[l])) {
							inValidInput = true;
							break;
						}
					}}catch(Exception e){
						System.out.println("Enter the correct values: ");
						continue;
					}
				}
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
				break;
			case 3:
				break;
			default:
				break;
		}
		scan.close();
	}
}
