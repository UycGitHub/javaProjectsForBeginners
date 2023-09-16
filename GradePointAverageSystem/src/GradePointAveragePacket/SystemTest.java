/*README SECTION:
 * The program evaluates the grade point average of a student object using switch-case command. 
 * A student object is created, on which we give the subjects and the corresponding grades. 
 * Then we create a method to evaluate the grade point average.
 * 
 * GRADE POINT AVERAGE SYSTEM 
 * Create a student class
 * For a student object, store the subjects and grades with ArrayLists
 * Find the GPA of this students
 * A=4.0, B=3.0, C=2.0, D=1.0, F=0.0
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=9vSW6-Dp9hQ&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=7&t=2s
 */

package GradePointAveragePacket;

public class SystemTest {

	public static void main(String[] args) {
		Student uyc = new Student("Umut");
		//reminder --> we use single quotes for char type
		uyc.add("Mathematic", 'C');
		uyc.add("English", 'A');
		uyc.add("History", 'B');
		uyc.add("Geography", 'D');
		
		System.out.println(uyc.getName() + " has a GPA of " + uyc.getGpa());
		
		System.out.println("It is obtained from these subjects:");
		
		for (String str : uyc.getSubjects()) {
			System.out.println(str);
		}

	}//end of the main method

}//end of the SystemTest Class
