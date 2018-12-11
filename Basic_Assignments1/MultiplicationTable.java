import java.util.*;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int value = number.nextInt();
		for(int i=1; i<=10; i++){
			int multiplication_value = multiply(value, i);
			int square_value = multiplication_value*multiplication_value;
			System.out.println(value+" * "+i+" = "+multiplication_value+"--->"+square_value);
		}
	}
	static int multiply(int value, int i){
		return value*i;
	}
}