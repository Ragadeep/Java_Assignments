// Taking Income as input and to display the percent of income tax for that ammount.
import java.util.*;
class IncomeTax{
	public static void main(String[] args){	
		Scanner value = new Scanner(System.in);
		System.out.print("Give income tax value: ");
		int income = value.nextInt();					// Taking Income value from input.
		if(income <= 180000){						// Conditions for checking income tax.
			System.out.println("Income Tax: NILL");
		} else if(income > 180000 && income <= 300000){
			System.out.println("Income Tax: 10%");
		} else if(income > 300000 && income <= 500000){
			System.out.println("Income Tax: 20%");
		} else if(income > 500000 && income <= 1000000){
			System.out.println("Income Tax: 30%");
		} else{
			System.out.println("Income Tax: 40%");
		}
	}	
}