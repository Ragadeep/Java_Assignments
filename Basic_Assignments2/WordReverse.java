import java.lang.String;
public class WordReverse {
	public String stringReverse(String str){
		String[] words = str.split(" ");
		String reverseString = "";
		for(int count=0; count<words.length; count++){
			String word = words[count];
			String reverseWord = "";
			for(int counter=word.length()-1; counter>=0; counter--){
				reverseWord = reverseWord+word.charAt(counter);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		return reverseString.trim();
	}
}
