// Byb the array numbers print the numbers in ascending order(sorting).
class SequentialSort{
	public static void insertionSort(int array[]) {  
        	int arrayLength = array.length;  
        	for (int count = 1; count < arrayLength; count++) {  
            		int key = array[count];  
            		int nextValue = count-1;  
            		while ( (nextValue > -1) && ( array [nextValue] > key ) ) {  
                		array [nextValue+1] = array [nextValue];  
                		nextValue--;  
            		}  
            		array[nextValue+1] = key;  
        	}  
    	} 

	public static void main(String a[]){    
        	int[] arrayOfNumbers = {5, 12,14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};    
        	System.out.println("Before Insertion Sort");    
        	for(int before:arrayOfNumbers){    
            		System.out.print(before+" ");   					//Before sorted. 
        	}    					
        	System.out.println();    
            
        	insertionSort(arrayOfNumbers);                                                  //sorting array using insertion sort    
           
        	System.out.println("After Insertion Sort");    
        	for(int after:arrayOfNumbers){    
            		System.out.print(after+" ");    					// After sorted
        	}    
    	}    
}