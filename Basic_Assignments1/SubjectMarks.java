// Program to promoted the student accourding to subjects marks.
import java.util.*;
class SubjectMarks{
	public static void main(String[] args){
		Scanner marks = new Scanner(System.in);
		System.out.print("subject 1 marks: ");
		int subject1 = marks.nextInt();
		System.out.print("subject 2 marks: ");
		int subject2 = marks.nextInt();
		System.out.print("subject 3 marks: ");
		int subject3 = marks.nextInt();
		if(subject1 >= 60 && subject2 >= 60 && subject3 >= 60){
			System.out.println("Passed");
		}
		else if((subject1 >= 60 && subject2 >= 60) || (subject1 >= 60 && subject3 >= 60) || (subject3 >= 60 && subject2 >= 60)){
			System.out.println("Promoted");
		}
		else{
			System.out.println("Failed");
		}
	}
}