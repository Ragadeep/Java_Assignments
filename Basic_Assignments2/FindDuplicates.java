
public class FindDuplicates {
	public String duplicatesRemove(String letters){
        char character;
        String answer="";
         
        for(int i=0; i<letters.length(); i++)
        {	
			character = letters.charAt(i);
            if(character!=' ')
                answer = answer + character;
            letters = letters.replace(character,' ');
        }
		return answer;
	}
}