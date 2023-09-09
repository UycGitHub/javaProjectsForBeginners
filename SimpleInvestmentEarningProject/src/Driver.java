/* README SECTION
 * We have a simple earnings calculator project. 
 * The sample code tracks the change in stock price after each trading day. 
 * The user enters the bid price and closing price on subsequent trading days. 
 * Then the earnings are evaluated. 
 * Trading stops when a negative closing price is entered.
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 */


import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		double buyingPrice = keyboardScanner.nextDouble();
		double closingPrice;
		int day = 1;
		
		while(true) {
			System.out.println("Enter the closing price for day " + day + " (any negative value to leave): ");
			closingPrice = keyboardScanner.nextDouble();
			if(closingPrice<0.00) break;
			
			double earnings = closingPrice - buyingPrice;
			
			if(earnings>0.00) {
				System.out.println("After day " + day + ", you earned " + earnings + " per share");
			}
			else if(earnings<0.00) {
				System.out.println("After day " + day + ", you lost " + (-earnings) + " per share");
			}
			else {
				System.out.println("After day " + day + ", you have no earnings per share");
			}
			
			day++;
		}
		
		keyboardScanner.close();
	}

}
