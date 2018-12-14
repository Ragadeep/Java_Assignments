
public class FindDeletedWordCount {
	public String removeSpaces(String sentence){
		String newSentence = sentence.trim().replaceAll("\\s{2,}", " ");
		String[] words = newSentence.split(" ");
		String sentenceToRemove = "IS";
		String finalSentence = "";
		for(int count=0; count<words.length; count++){
			if(sentenceToRemove.equals(words[count])){
				continue;
			}
			else{
				finalSentence += words[count] + " ";
			}
		}		
		System.out.println(finalSentence.trim());
		return finalSentence.trim();
	}
}
