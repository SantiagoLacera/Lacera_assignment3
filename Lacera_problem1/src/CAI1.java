import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {

	// Variables
	static int randNum1CAI1;
	static int randNum2CAI1;
	static int totalNumSystemCAI1;
	static int totalNumUserCAI1;

	// Main method
	public static void main(String args[]) {
		// create instance of Random class
		SecureRandom randomNum = new SecureRandom();

		// Generate random integers in range 0 to 9
		randNum1CAI1 = randomNum.nextInt(10);
		randNum2CAI1 = randomNum.nextInt(10);
		totalNumSystemCAI1 = randNum1CAI1 * randNum2CAI1;

		quiz();

	}

	static public void quiz() {
		askQuestion();
		readResponse();
		isAsnwerCorrect();
	}

	private static void askQuestion() {
		System.out.println("How much is " + randNum1CAI1 + " * " + randNum2CAI1 + "?");
	}

	private static void readResponse() {
		Scanner in = new Scanner(System.in);
		totalNumUserCAI1 = in.nextInt();
		in.close();
	}

	private static void isAsnwerCorrect() {
		if (totalNumUserCAI1 == totalNumSystemCAI1) {
			displayCorrectResponse();

		} else {
			displayInorrectResponse();
			quiz();
		}

	}

	private static void displayCorrectResponse() {
		System.out.println("Very good!");

	}

	private static void displayInorrectResponse() {
		System.out.println("No. Please try again.\n");

	}

}
