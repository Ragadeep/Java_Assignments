
public class GetMissingValue {
	public int findNumber(int[] arrayOfNumbers){
		int counter, total=0; 
		int arrayLength = arrayOfNumbers.length+1;
        int sum  = ((arrayLength)*(arrayLength+1))/2;    
        for (counter = 0; counter< arrayLength; counter++) {
           total += arrayOfNumbers[counter]; 
        }
        int missingNumber = sum-total;
        System.out.println(total);
        return total; 
	}
}
