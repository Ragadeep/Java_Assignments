//Giving 3 student marks in three subjects and finding his average and total marks in all subjects.
import java.util.*;
class StudentAverage{
	public static void main(String[] args){
		int studentDetails[][] = new int[3][3];							// 2D array for 3 subject marks and 3 students details
		int total, rows, columns;
		Scanner students = new Scanner(System.in);	
		for(rows=0; rows<3; rows++){								// Rows indicates the number of persons
			System.out.println("Enter student"+(rows+1)+"marks in A, B and C subjects: ");
			for(columns=0; columns<3; columns++){						// columns indicates the number of subjects
				studentDetails[rows][columns] = students.nextInt();			// Taking 3 subjects marks form input.
			}
		}  
		for(rows=0; rows<3; rows++){
			total = 0;									// Initially declaring total as 0.
			for(columns=0; columns<3; columns++){
				total += studentDetails[rows][columns];
			}
			System.out.println("Total student scores"+(rows+1)+" :"+total);
			System.out.println("Average score is: "+(total/3));
		}
	}
}