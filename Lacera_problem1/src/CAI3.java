import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {
	static int randResponseNum;
  	static int randNum1CAI2;
  	static int randNum2CAI2;
  	static int totalNumSystemCAI2;
	static int totalNumUserCAI2;
	static double scoreUserPercentage;
	static int goodAnsNum = 0;
	static int count = 0;
	
	static Scanner in = new Scanner(System.in);

  	  
        
	// Main method
	public static void main(String args[]) {
		
		

		quiz();

	}

	static public void quiz() {
		
		do {
			count++;
			newSystemNumbers();
			newRandomNum();
			askQuestion();
			readResponse();
			isAsnwerCorrect();
		} while (count != 10);
		displayCompletionMessage();
		questionUserContinue();
	}

	private static void askQuestion() {
		System.out.println(count + ". How much is " + randNum1CAI2 + " times " + randNum2CAI2 + "?");
	}

	private static void readResponse() {
		
		totalNumUserCAI2 = in.nextInt();
		
	}

	private static void isAsnwerCorrect() {
		
		if (totalNumUserCAI2 == totalNumSystemCAI2) {
			displayCorrectResponse2();
		} else {
			displayInorrectResponse2();
		}

	}
	
	private static void displayCompletionMessage() {
		scoreUserCalculation();
  		if(scoreUserPercentage >= 75) {
  			System.out.println("Congratulations, you are ready to go to the next level!");
  			questionUserContinue(); 
  		}else {
  			System.out.println("Please ask your teacher for extra help.");
  			questionUserContinue();
  		}
  		  
  	  }
	private static void newSystemNumbers() {
		// create instance of Random class
		SecureRandom randomNum = new SecureRandom();
		randNum1CAI2 = randomNum.nextInt(10);
		randNum2CAI2 = randomNum.nextInt(10);
		totalNumSystemCAI2 = randNum1CAI2 * randNum2CAI2;
	}
	private static void newRandomNum() {
		// create instance of Random class
		Random randomResponsesNum = new Random();
		randResponseNum = randomResponsesNum.nextInt(3);
		randResponseNum += 1;
	}

  	  

  	  private static void displayCorrectResponse2() {
  		  switch(randResponseNum) {
  		  case 1:
  			System.out.println("Very good!\n");
  			break;
  		  case 2:
  			System.out.println("You Rock\n");
  			break;
  		  case 3:
  			System.out.println("GG\n");
  			break;
  		  case 4:
  			System.out.println("Perfect score!\n");
  			break;
  		  }
  	    goodAnsNum++;

  	  }

  	  private static void displayInorrectResponse2() {
  	    
  	  switch(randResponseNum) {
		  case 1:
			  System.out.println("No. Please try again.\n");
			break;
		  case 2:
			System.out.println("You suck, JK\n");
			break;
		  case 3:
			System.out.println("You will get it next time :)\n");
			break;
		  case 4:
			System.out.println("Don’t give up!\n");
			break;
		  }

  	  }
  	  
  	  private static void scoreUserCalculation() {
  		  
  		scoreUserPercentage = (goodAnsNum / 10) * 100;
  		  
  	  }
  	  
  	  private static void questionUserContinue() {
  		int userChoice;
  		System.out.println("If you will like to continue with a new set of problems press:");
  		System.out.println("1. To Continue");
  		System.out.println("2. To Exit");
  		userChoice = in.nextInt();
  		if(userChoice == 1) {
  			count = 0;
  			quiz();
  		}else if(userChoice == 2){
  			System.out.println("Bye, Bye!");
  			System.exit(0);
  		}else {
  			System.out.println("This is not vaid");
  			questionUserContinue();
  		}
  		
;  		
  	  }
  	  

}
