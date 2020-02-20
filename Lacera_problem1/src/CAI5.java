import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	static int randResponseNum;
  	static int randNum1CAI4;
  	static int randNum2CAI4;
  	static int totalNumSystemCAI4;
	static int totalNumUserCAI4;
	static double totalNumUserCAIDivide4;
	static double totalNumSystemCAIDivide4;
	static int difficultyLevelNum;
	static int problemTypeNum;
	static double scoreUserPercentage;
	static double goodAnsNum = 0.0;
	static int count = 0;
	static boolean divideStatment = false;
	static boolean case5 = false;
	
	static Scanner in = new Scanner(System.in);

  	  
        
	// Main method
	public static void main(String args[]) {
		SecureRandom randomNum = new SecureRandom();
		randNum1CAI4 = randomNum.nextInt(10);
		randNum2CAI4 = randomNum.nextInt(10);
		Random randomResponsesNum = new Random();
		randResponseNum = randomResponsesNum.nextInt(3);
		randResponseNum += 1;
		
		//Quiz method  main
		quiz();

	}

	static public void quiz() {
		
		
		userDifficultyLevel();
		userProblemType();
		do {
			count++;
			newSystemNumbers();
			newRandomNum();
			askQuestion();
			readResponse();
			problemTypeNum();
			isAsnwerCorrect();
		} while (count != 10);
		displayCompletionMessage();
		questionUserContinue();
	}

	
	private static void problemTypeNum() {
		switch (problemTypeNum) {
		case 1:
			totalNumSystemCAI4 = randNum1CAI4 + randNum2CAI4;
			break;
		case 2:
			totalNumSystemCAI4 = randNum1CAI4 * randNum2CAI4;
			break;
		case 3:
			totalNumSystemCAI4 = randNum1CAI4 - randNum2CAI4;
			break;
		case 4:
			totalNumSystemCAIDivide4 = ((double)randNum1CAI4 / (double)randNum2CAI4);
			divideStatment = true;
			break;
			}
				
	}

	private static void userDifficultyLevel() {
            
		System.out.println("Select the Type of difficulty between:");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.println("3. Hard");
		System.out.println("4. Extra hard");
		difficultyLevelNum = in.nextInt();

		
	}
	
	private static void userProblemType() {
		System.out.println("Select the Type of problem between:");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Subtraction");
		System.out.println("4. Division");
		System.out.println("5. Mixture");
		problemTypeNum = in.nextInt();
		
	}


	private static void askQuestion() {
		Random randomQuestionNum = new Random();
		
		if(problemTypeNum == 5 || case5 == true) {
		    case5 = true;
 			problemTypeNum = randomQuestionNum.nextInt(4);
			problemTypeNum += 1;
		}
		switch (problemTypeNum) {
		case 1:
			System.out.println(count + ". How much is " + randNum1CAI4 + " + " + randNum2CAI4 + "?");
			break;
		case 2:
			System.out.println(count + ". How much is " + randNum1CAI4 + " * " + randNum2CAI4 + "?");
			break;
		case 3:
			System.out.println(count + ". How much is " + randNum1CAI4 + " - " + randNum2CAI4 + "?");
			break;
		case 4:
			System.out.println(count + ". How much is " + randNum1CAI4 + " / " + randNum2CAI4 + "?");
			break;
		}
	}

	private static void readResponse() {
		 
		
		if(problemTypeNum == 4) {
			totalNumUserCAIDivide4 = in.nextDouble();
		} else {
			totalNumUserCAI4 = in.nextInt();
		}
		
	}

	private static void isAsnwerCorrect() {
		if (divideStatment == true) {
			if (totalNumSystemCAIDivide4 == totalNumUserCAIDivide4) {
				displayCorrectResponse2();
			} else {
				displayInorrectResponse2();
			}
			
		}
		if (divideStatment == false) {
			if (totalNumUserCAI4 == totalNumSystemCAI4) {
				displayCorrectResponse2();

			} else {
				displayInorrectResponse2();
			}
		} 
		divideStatment = false;
	}
			

	
	private static void displayCompletionMessage() {
		scoreUserCalculation();
  		if(scoreUserPercentage >= 75) {
  			System.out.println("Your score was " + scoreUserPercentage + "% Congratulations, you are ready to go to the next level!");
  			questionUserContinue(); 
  		}else {
  			System.out.println("Your score was " + scoreUserPercentage + "% Please ask your teacher for extra help.");
  			questionUserContinue();
  		}
  		  
  	  }
	private static void newSystemNumbers() {
		// create instance of Random class
		SecureRandom randomNum = new SecureRandom();
		
		 switch(difficultyLevelNum) {
 		  case 1:
 			randNum1CAI4 = randomNum.nextInt(10);
 			randNum2CAI4 = randomNum.nextInt(10);
 			break;
 		  case 2:
 			randNum1CAI4 = randomNum.nextInt(100);
  			randNum2CAI4 = randomNum.nextInt(100);
 			break;
 		  case 3:
 			 randNum1CAI4 = randomNum.nextInt(1000);
  			randNum2CAI4 = randomNum.nextInt(1000);
 			break;
 		  case 4:
 			 randNum1CAI4 = randomNum.nextInt(10000);
  			randNum2CAI4 = randomNum.nextInt(10000);
 			break;
 		  }
		
	}
	private static void newRandomNum() {
		// create instance of Random class
		Random randomResponsesNum = new Random();
		randResponseNum = randomResponsesNum.nextInt(3);
		randResponseNum += 1;
	}

  	  

  	  private static void displayCorrectResponse2() {
  		goodAnsNum++;
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
  		  
  		scoreUserPercentage = (goodAnsNum / 10.0) * 100.00;
  		  
  	  }
  	  
  	  private static void questionUserContinue() {
  		int userChoice;
  		System.out.println("If you will like to continue with a new set of problems press:");
  		System.out.println("1. To Continue");
  		System.out.println("2. To Exit");
  		userChoice = in.nextInt();
  		if(userChoice == 1) {
  			goodAnsNum = 0;
  			count = 0;
  			quiz();
  		}else if(userChoice == 2){
  			System.out.println("Bye, Bye!");
  			System.exit(0);
  		}else {
  			System.out.println("This is not vaid");
  			questionUserContinue();
  		}
  		
  	  }
}


