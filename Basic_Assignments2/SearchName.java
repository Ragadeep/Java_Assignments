
public class SearchName {
	public int checkName(String[] arrayOfNames, String givenName){
		int counter=0;
		
 		for(int count=0; count<arrayOfNames.length; count++)
 		{
			if(givenName.equals(arrayOfNames[count])) {
				counter++;
			}
		}
		 		System.out.println(counter);
		return counter;
	}
}
