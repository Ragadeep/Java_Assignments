// Enter the login details of person which want to match with already given details.
import java.util.*;
class Login{
	public static void main(String[] args){
		String loginName = "ragadeep";							
		String password = "raga@123";
		int count=0;
		Scanner details = new Scanner(System.in);  
		for(count=1; count<=3; count++){							// Allowing to enter login details only 3 times.
			System.out.print("Enter your Username: ");
			String login_name = details.next();						// Getting username from input.
			System.out.print("Enter your Password: ");
			String given_password = details.next();						// Getting password from input.
			if((login_name.equals(loginName)) && (given_password.equals(password))){	// Equating the input details with already given details
				System.out.println("Welcome "+login_name);
				break;									
			}
		}
		if(count>3){
			System.out.println("Contact Admin");						
		}
	}
}