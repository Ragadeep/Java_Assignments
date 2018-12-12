// Check the given number is Amstrong or Not.

import java.util.*;
class AmstrongNumber{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);				
		System.out.print("Enter the number to check Amstrong: ");
		int value = number.nextInt();						// For taking input given value.
		amstrong(value);
		if( amstrong(value) == value){						// Equating the return function with given value.
			System.out.println("This amstrong Number");
		}
		else{
			System.out.println("This is not an amstrong Number");			
		}
	}
	static double amstrong(int value){
		int count=0;
		double result=0; 
		int original_number = value;
		while(original_number != 0){					// This loop is to count digits of given value.
			original_number /= 10;
			++count;						// Incrementing the value every time to make pow.
		}
		while(value != 0){
			int reminder = value%10;
			result += Math.pow(reminder, count);			// making each digit power with count and adding all for knowing Amstrong Number.
			value = value/10;
		}	
		return result;				// returning the result to equate in main method with given value.
	}
}
