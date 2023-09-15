/* README SECTION:
 * 
 * The program adds a time to a given time. 
 * It handles the issue of carry digits arising from adding seconds, minutes 
 * and hours by using if statements.
 * 
 * TIME ADDER
 *  Give the current time in hour, minute, second
 *  Give the time to go forward in hour, minute, second
 *  Evaluate the new time using  addition of time
 *  
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=EuFpklFR9FM&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=6&t=1s
 */
package TimeAdderPackage;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int currentHour, currentMinute, currentSecond, forwardHour, forwardMinute, forwardSecond;
		int answerHour = 0, answerMinute = 0, answerSecond = 0;
		int carrySecond = 0, carryMinute = 0; // for transform
		boolean isNextDay = false;
		
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Enter current hour: ");
		currentHour = keyboardScanner.nextInt();
		System.out.println("Enter current minute: ");
		currentMinute = keyboardScanner.nextInt();
		System.out.println("Enter current second: ");
		currentSecond = keyboardScanner.nextInt();
		
		System.out.println("Enter hour go to forward: ");
		forwardHour = keyboardScanner.nextInt();
		System.out.println("Enter minute go to forward: ");
		forwardMinute = keyboardScanner.nextInt();
		System.out.println("Enter second go to forward: ");
		forwardSecond = keyboardScanner.nextInt();
		
		answerSecond = currentSecond + forwardSecond;
		if(answerSecond>=60) {
			answerSecond -= 60;
			carrySecond = 1;
		}
		
		answerMinute = currentMinute + forwardMinute + carrySecond;
		if(answerMinute>=60) {
			answerMinute -= 60;
			carryMinute = 1;
		}
		
		answerHour = currentHour + forwardHour + carryMinute;
		if(answerHour>=24) {
			if( !(answerHour == 24 && answerMinute ==0 && answerSecond==0) ) {
				answerHour -= 24;
				isNextDay = true;
			}
		}
		
		if(isNextDay) {
			System.out.println("The anwser is " + answerHour + ". " + answerMinute + ". " + answerSecond + " on the next day.");
		}
		else {
			System.out.println("The anwser is " + answerHour + ". " + answerMinute + ". " + answerSecond);
		}
		
		keyboardScanner.close();
		

	}//end of the main

}//end of the class
