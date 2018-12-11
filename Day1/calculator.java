import java.util.*;
class Calculator{
	static float number1, number2;
	public static void main(String[] args){
		//declaring the objects and initialized with input objects
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first value: ");
		float number1 = num.nextFloat();
		System.out.print("Enter second value: ");
		float number2 = num.nextFloat();  
		System.out.println("addition of two numbers: "+addition(number1,number2));
		System.out.println("subtraction of two numbers: "+subtraction(number1,number2));
		System.out.println("division of numbers: "+division(number1,number2));
	}
	static float addition(float number1, float number2){
		return number1+number2;
	}
	static float subtraction(float number1, float number2){
		return number1-number2;
	}
	static float division(float number1, float number2){
		return number1/number2;
	}	
}