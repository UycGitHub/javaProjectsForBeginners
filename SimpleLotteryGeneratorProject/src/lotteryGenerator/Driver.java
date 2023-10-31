/*
 * README SECTION:
 * 
 * We generate 6 numbers out of 49 numbers. 
 * We have to check that a drawn number is not repeating all the previously drawn numbers. 
 * We sort the results finally.
 * 
 * LOTTERY NUMBER GENERATOR
 * Pick 6 numbers between 1 and 49
 * After drawing a number, check if it is repeated in drawn numbers
 * If repeated, loop the draw until it is not repeated
 * Sort the numbers using Arrays.sort method
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=rcthbWylwew&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=12
 */
package lotteryGenerator;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 1, max = 49, slots = 6;
		int[] lotteryArray = new int[slots];
		boolean isRepeated;
		int randomNuber = 0;
		
		for(int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
			do {
				isRepeated = false;
				//1 to 49
				randomNuber = random.nextInt(max + 1 - min) + min;
				
				//check for repeated number against
				//the filled non-zero elements
				for(int k = 0; k<=indexDrawn; k++) {
					//hope that none repeats the random number
					if(lotteryArray[k] == randomNuber) {
						isRepeated = true;
						break;
					}
				}
				
			}while(isRepeated);
		lotteryArray[indexDrawn] = randomNuber;

		}
		
		Arrays.sort(lotteryArray);
		
		System.out.println("The result of the lottery:");
		for(int i = 0; i < slots; i++) {
			System.out.print(lotteryArray[i] + " ");
		}

	}//end of main method
	
}//end of class

