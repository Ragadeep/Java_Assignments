// By giving value which is in array and getting the index numv=ber. 
import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		int arrayOfNumbers[] = {5, 12,14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};		// array of numbers to search index value.
		Scanner inputValue = new Scanner(System.in);
		System.out.print("Enter value to search: ");
		int numberToFind = inputValue.nextInt();
		int arrayLength = arrayOfNumbers.length;
		int count;
		for(count=0; count<=arrayLength; count++){
			if(arrayOfNumbers[count]==numberToFind){					// Condition to check given value with array indexs.
				System.out.println("value found in array Index: "+count);
				break;
			} 
		}	
	}
}