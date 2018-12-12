// Remove the duplicates from the given array of numbers and display without duplicates.
class RemoveDuplicates {
 
    public static int[] removeDuplicates(int[] input){
         
        int repetedValue = 0;
        int withoutDuplicate = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(withoutDuplicate < input.length){
            if(input[withoutDuplicate] == input[repetedValue]){
                withoutDuplicate++;
            }else{
                input[++repetedValue] = input[withoutDuplicate++];
            }    
        }
        int[] output = new int[repetedValue+1];
        for(int count=0; count<output.length; count++){
            output[count] = input[count];
        }
         
        return output;
    }
     
    public static void main(String a[]){
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};				// Array with duplicates numbers.			
        int[] output = removeDuplicates(input1);
        for(int withoutDuplicate:output){
            System.out.print(withoutDuplicate+" ");				// Array after duplicates removed.
        }
    }
}