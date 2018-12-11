// Print the Amstrong numbers form given range

import java.util.*;
class AmstrongNumbersRange{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);				
		System.out.print("Enter the value first number: ");
		int low = number.nextInt();
		System.out.print("Enter the number to end amstrong ranges: ");
		int high = number.nextInt();
		int i;
		for(i = low; i < high; ++i){
        		int temp2 = i;
        		int temp1 = i;
			int result = 0, n=0;
        		while (temp1 != 0){
            			temp1 /= 10;
            			++n;
        		}
        		while (temp2 != 0){
            			int remainder = temp2 % 10;
            			result += Math.pow(remainder, n);
            			temp2 /= 10;
        		}
        
        		if (result == i) {
            			System.out.println(i);
        		}
		}
	}
}
