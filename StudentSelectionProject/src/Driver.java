import java.util.Scanner;

/*README SECTION:
 * The program selects the students above a certain age. 
 * It first asks for the number of students. Then you input the names and their age. 
 * Finally, the program tells you the student names who are above a certain age.  
 * Arrays are used in the program. 
 * 
 * Determine who are above 15 years old to receive a vaccine.
 * Enter number of students.
 * Input student names and age.
 * Use arrays. 
 * 
 * While developing this project, 
 * I watched the videos of the "Begin Code Fast" YouTube channel.
 * Video Link 
 * https://www.youtube.com/watch?v=cLo8268tmjE&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=5
 */
public class Driver {

	public static void main(String[] args) {
		int numStudents;
		Scanner keyboardScaneScanner = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		numStudents = keyboardScaneScanner.nextInt();
		String[] studentStrings = new String[numStudents];
		int[] age = new int[numStudents];
		Scanner scanNameScanner = new Scanner(System.in);
		Scanner scanAgeScanner = new Scanner(System.in);
		
		for(int i=0; i<numStudents; i++) {
			System.out.println("Enter name: ");
			studentStrings[i] = scanNameScanner.nextLine();
			System.out.println("Enter age of student: ");
			age[i] = scanAgeScanner.nextInt();
			
			if(age[i]>=15) {
				System.out.println(studentStrings[i] + " can receive a vaccine.");
				System.out.println("The student is now " + age[i]);
			}
		}//end of the for loop
		
		keyboardScaneScanner.close();
		scanAgeScanner.close();
		scanNameScanner.close();

	}//end of the main method

}
