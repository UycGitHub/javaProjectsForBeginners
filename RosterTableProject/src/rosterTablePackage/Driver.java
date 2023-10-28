/*README SECTION:
 * We set up a roster table using an ArrayList of ArrayLists. 
 * We also obtain the days of duty for a certain person. 
 * To do so, we loop over each element in the sub-ArrayLists.
 * 
 * ROSTER TABLE
 * Create an ArrayList of ArrayList
 * Put names for a day into an ArrayList
 * Put a number of ArrayLists for the days into an ArrayList
 * Get the days of duty for a person
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=okPNq1FHQzs&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=12
 */
package rosterTablePackage;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		//we must import the java.util.ArrayList library.
		// I will import the java.util* for all needs
		
		// I have 3 days of work in a certain activity
		int days = 3;
		
		//ArrayList of ArrayLists
		ArrayList<ArrayList<String>> roster = new ArrayList<ArrayList<String>>(days);
		
		//each sub-ArrayList
		ArrayList<String> day1 = new ArrayList<String>();
		ArrayList<String> day2 = new ArrayList<String>();
		ArrayList<String> day3 = new ArrayList<String>();
		
		day1.add("Alice");
		day1.add("Bob");
		roster.add(day1);
		
		day2.add("Alice");
		day2.add("Sam");
		day2.add("Mike");
		roster.add(day2);
		
		day3.add("Ray");
		day3.add("Sam");
		roster.add(day3);
		
		//I want to get the days of duty for a particular person
		//I can try set up a method called getDays and call it
		getDays(roster, "Alice");
		System.out.println("-------------------");
		getDays(roster, "Sam");
		
	}//end of the main method
	
	//getDays method
	public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
		for (ArrayList<String> arrList : rosterTable) {
			for (String str : arrList) {
				if(str.contentEquals(name)) {
					System.out.println(rosterTable.indexOf(arrList) + 1);
				}
			}
		}
	}

}
