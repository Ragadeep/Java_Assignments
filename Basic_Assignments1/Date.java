// By taking the given date and display month number with month name.
import java.util.*;
import java.text.DateFormatSymbols;

class Date{
	public static void main(String[] args){
		Scanner date = new Scanner(System.in);
		date.useDelimiter("\\D");					// To allow date with commas like 23,09,1997.
		int day = date.nextInt();					// Getting day from input
		int month = date.nextInt();					// Getting month in the form of number
		int year = date.nextInt();
		System.out.println(day+"/"+getMonth(month)+"/"+year);		// Displaying the date with month name.
	}
	static String getMonth(int month) {
    		return new DateFormatSymbols().getMonths()[month-1];		// Returning month name with java functions.
	}
}