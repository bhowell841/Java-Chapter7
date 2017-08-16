import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * Project tracks user inputs of grades and 
 * tracks the amount of each grade that is entered
 * A's = 1 etc
 */
public class GradesTracking {

	public static void main(String[] args) {
		// Instance of scanner
		Scanner input = new Scanner(System.in);
		
		int grades[] = new int[5];
		int score = 0;
		int total = 0;
		int counter = 0;
		double average = 0.0;
		int highest = 0;
		int lowest = 100;
		
		// Start while loop
		do{
				
		// get scores
		System.out.println("Enter a numeric grade (0-100) or -1 to exit: ");
		score = input.nextInt();
		
		// start if statement
		// increment counter
		if (score != -1){
			counter++;
		
		// calculate total
		total += score;
		
		//calculate average
		average = (total/counter);
		
		
		//get Highest grade
		if (highest < score){
			highest = score;
		}
		
		//get Lowest grade
		if (lowest > score){
			lowest = score;
		}
		
		} // end if statement
		
		// decision statement 
		if (score >= 90 && score <= 100){
			grades[0]++;
		}
		else
			if (score >= 80 && score <=89){
				grades[1]++;
			}
			else
				if (score >=70 && score <= 79){
					grades[2]++;
				}
				else
					if (score >= 60 && score <= 69){
						grades[3]++;
					}
					else
						if (score >= 0 && score < 60 ){
							grades[4]++;
						}
						else
							if
							(score == -1){
								System.out.println("Thank you");
							}
							else	
								System.out.println("Invalid Selection.");
		}while (score != -1);  // End While	
		
		
		// Output Results
		System.out.println("Number of A grades: " + grades[0]);
		System.out.println("Number of B grades: " + grades[1]);
		System.out.println("Number of C grades: " + grades[2]);
		System.out.println("Number of D grades: " + grades[3]);
		System.out.println("Number of F grades: " + grades[4]);
		System.out.println("Average is: " + average);
		System.out.println("Highest grade is: " + highest);
		System.out.println("Lowest grade is: " + lowest);
	}  //  End main

}  //  End class
