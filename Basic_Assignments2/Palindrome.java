
public class Palindrome {
	public int palindromeNumber(int value){
		int sum = 0;
		int temp = value;
		if(value>9){
			while(value>0){
				int reminder = value%10;
				sum = (sum*10)+reminder;
				value /= 10;
			}
			if(sum == temp){
				return 1;
			}
			else{
				return 0;
			}
		}
		return sum;
	}
}
