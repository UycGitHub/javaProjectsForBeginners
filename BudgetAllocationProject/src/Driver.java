import java.util.ArrayList;
import java.util.Scanner;

/*README SECTION:
 * This example demonstrates the budget allocation task. 
 * A user inputs the amount available to spend. 
 * Then the user inputs the proportions of the amount on each expense item. 
 * The expense input can stop if the total proportion exceeds 100%. 
 * Finally, the program shows the amount spent on each expense item.
 * 
 * Enter your budget
 * Enter the proportion of each expenses item
 * Ignore further items if proportion exceeds %100
 * Use ArrayList to store expense proportions
 * Find the amount for each item
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=uZDuvMo-4pU&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=2&t=1s
 * 
 */
public class Driver {

	public static void main(String[] args) {
		double total;
		double sum = 0;
		int i=0;
		ArrayList<Double> proportionArrayList = new ArrayList<Double>();
		Scanner keyboardScanner = new Scanner(System.in);
		
		System.out.print("How much can you spend? ");
		total = keyboardScanner.nextDouble();
		System.out.println("Enter your proportion of various expenses");
		System.out.println("The system stops if cumulative prportion exceeds %100");
		
		do {
			System.out.println("Your proportion of expense " + (i+1) + ":");
			double value = keyboardScanner.nextDouble();
			proportionArrayList.add(value);
			sum+= proportionArrayList.get(i);
			i++;
		} while (sum<=100);
		keyboardScanner.close();
		
		if(sum>100.00) {
			double cumulativeSum = 0.00;
			for(int j=0; j<(proportionArrayList.size()-1); j++) {
				cumulativeSum += proportionArrayList.get(j); 
			}
			
			proportionArrayList.set( (proportionArrayList.size()-1), (100-cumulativeSum) );
		}
		for (double value : proportionArrayList) {
			double expense = value*total/100.00;
			System.out.println("Your " + value + "% equals $" + expense);
		}
	}

}
