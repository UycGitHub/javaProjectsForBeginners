/*README SECTION:
 * The program counts the number of words in a string. 
 * It removes the leading and trailing spaces of the received string. 
 * Then it searches for the space-character pattern as the indicator of a word.
 * 
 * COUNT WORDS
 * Get a string from user input
 * 	Count the numbers of words in the string
 * 	Count with a window of width 2
 * 	Search for "_?" patterns
 * 	Add 1 the first word on the trimmed string
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=_y7gvwch2r0&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=11
 */
package wordCounterPackage;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String userInputString;
		int count = 0;
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Type your paragraph: ");
		userInputString = keyboardScanner.nextLine();
		keyboardScanner.close();
		userInputString = userInputString.trim();
		
		if (userInputString.length() == 0) {
			count = 0;
		}
		else {
			/*count the first word
			 *it must exist because the first character must not be a space
			 */
			count++;
			
			for(int i=0; i<userInputString.length(); i++) {
				if(userInputString.charAt(i) == ' ' && userInputString.charAt(i+1) != ' ') {
					//' ?'
					count++;
				}
			}//end of the for loop
		}//end of the else
		
		System.out.println("Word count: " + count);

	}//end of the main method

}
