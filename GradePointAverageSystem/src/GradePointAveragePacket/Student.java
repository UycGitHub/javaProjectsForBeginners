package GradePointAveragePacket;
import java.util.ArrayList;


public class Student {
	private String name;
	private ArrayList<String> subjecstArrayList;
	private ArrayList<Character> gradesArrayList;
	
	//I did not use "this". 
	//Because that projects simplicity level is "beginner."
	public Student(String nameParameter) {
		name = nameParameter;
		subjecstArrayList = new ArrayList<String>();
		gradesArrayList = new ArrayList<Character>();
	}
	
	public String getName() {
		return name;
	}
	
	public void add(String subjectParameter, Character gradeParameter) {
		subjecstArrayList.add(subjectParameter);
		gradesArrayList.add(gradeParameter);
	}
	
	public ArrayList<String> getSubjects() {
		return subjecstArrayList;
	}
	
	public double getGpa() {
		double totalPoint = 0.0;
		for (Character g : gradesArrayList) {
			switch (g) {
			case 'A': {
				totalPoint += 4.0;
				break;
			}
			case 'B': {
				totalPoint += 3.0;
				break;
			}
			case 'C': {
				totalPoint += 2.0;
				break;
			}
			case 'D': {
				totalPoint += 1.0;
				break;
			}
			case 'F': {
				totalPoint += 0.0; //This line is necessary but I prefer for your learning 
				break;
			}
			
			}//end of the switch
		}//end of the for loop
		
		return totalPoint / gradesArrayList.size();
	}//end of the getGpa method
	
}//end of the Student Class
