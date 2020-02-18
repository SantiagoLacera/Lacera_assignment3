import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class CAI2 {
	
	 
  	static int randResponseNum;
  	static int randNum1CAI2;
  	static int randNum2CAI2;
  	static int totalNumSystemCAI2;
	static int totalNumUserCAI2;

  	  
        
	// Main method
	public static void main(String args[]) {
		
		
		// create instance of Random class
		Random randomResponsesNum = new Random();
		SecureRandom randomNum = new SecureRandom();
		
		randResponseNum = randomResponsesNum.nextInt(3);
		randNum1CAI2 = randomNum.nextInt(10);
		randNum2CAI2 = randomNum.nextInt(10);
		totalNumSystemCAI2 = randNum1CAI2 * randNum2CAI2;
		randResponseNum += 1;
		quiz();

        
	}
	static public void quiz() {
		askQuestion();
		readResponse();
		isAsnwerCorrect();
	}

	private static void askQuestion() {
		System.out.println("How much is " + randNum1CAI2 + " * " + randNum2CAI2 + "?");
	}

	private static void readResponse() {
		Scanner in = new Scanner(System.in);
		totalNumUserCAI2 = in.nextInt();
	}
	private static void newRandomNum() {
		// create instance of Random class
		Random randomResponsesNum = new Random();
		randResponseNum = randomResponsesNum.nextInt(3);
		randResponseNum += 1;
	}

	private static void isAsnwerCorrect() {
		if (totalNumUserCAI2 == totalNumSystemCAI2) {
			displayCorrectResponse2();
		} else {
			displayInorrectResponse2();
			quiz();
		}

	}

  	  

  	  private static void displayCorrectResponse2() {
  		  switch(randResponseNum) {
  		  case 1:
  			System.out.println("Very good!");
  			break;
  		  case 2:
  			System.out.println("You Rock");
  			break;
  		  case 3:
  			System.out.println("GG");
  			break;
  		  case 4:
  			System.out.println("Perfect score!");
  			break;
  		  }
  	    

  	  }

  	  private static void displayInorrectResponse2() {
  	    
  	  switch(randResponseNum) {
		  case 1:
			  System.out.println("No. Please try again.\n");
			break;
		  case 2:
			System.out.println("You suck, JK");
			System.out.println(randResponseNum);
			break;
		  case 3:
			System.out.println("You will get it next time :)");
			break;
		  case 4:
			System.out.println("Don’t give up!");
			break;
		  }

  	  }
    

}

