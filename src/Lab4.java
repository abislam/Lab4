import java.util.Scanner;
import java.util.Random;

public class Lab4 {
	public static void main(String args[]){
		//First ask the user for a level and a problem type.
		
		//You need to validate the level and problem type and loop until the user enters a correct one.
		
		/*There should be 3 levels. Level 1 operands would have values in the range of 0-9, 
		 * level 2 operands would have values in the range of 0-99, 
		 * and level 3 operands would have values in the range of 0-999.*/
		
		
		//Each problem will consist of three randomly generated operands.
		
		/* There should be 4 problem types. Problem type 1 requires the student to find the sum of the three numbers, 
		 * problem type 2 requires the user to find the integer average of the three numbers, 
		 * problem type 3 requires the user to find the largest of the three numbers, 
		 * and problem type 4 requires the user to find the smallest of the three numbers.*/
		
		//The program should ask the user 10 questions.
		
		/*The program should randomly generate the numbers for each problem and display them to the user. 
		 * Then the program should get the users answer and check that answer.*/
		
		/*The program should provide individual feedback for each problem. 
		 * There should be 3 different positive and 3 different negative feedbacks chosen from for each problem.*/
		
		/*After the user finishes their 10 problems, display the number they got right 
		 * and then query them if they want to play again. 
		 * If they choose to play again, get a new level and problem type before asking 10 new problems. */
		
		//generate the random numbers based on level selected
		Random rand = new Random();
		int randLevel1 = rand.nextInt(10);
		int randLevel2 = rand.nextInt(100);
		int randLevel3 = rand.nextInt(1000);
		
		Scanner scan = new Scanner(System.in);
		int level, problemType;
		
		
		//This code block checks for correct question type and level input from user
		while(true) {
			System.out.print("Enter the level of the problem. Please choose a level between 1 and 3: ");
			level = scan.nextInt();
			
			if(level == 1 || level == 2 || level == 3) {
				//if correct, ask for problem type
				while(true) {
					System.out.println("Please enter the level of your problem type. Between 1 and 4: ");
					problemType = scan.nextInt();
					
					if(problemType == 1 || problemType == 2 || problemType == 3 || problemType == 4) {
						System.out.println("Problem Type " + problemType + "\nDifficulty " + level);
						break;
					}else {
						System.out.print("Incorrect input. Please enter 1, 2, 3 or 4 as your input: ");
					}
				}
				break;
				
			}else {
				System.out.print("Incorrect input. Please enter 1, 2 or 3 as your input: ");
			}
		}										
		

	}

}
