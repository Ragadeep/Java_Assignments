import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DeleteWordInSentence {
	private FindDeletedWordCount deleteWord;
	@Before
	public void setUp(){
		deleteWord = new FindDeletedWordCount();
	}
	@Test
	public void test() {
		String changedString = deleteWord.removeSpaces("A    MORNING WALK IS A   IS   BLESSING   FOR   THE  WHOLE DAY ");
		assertEquals("A MORNING WALK A BLESSING FOR THE WHOLE DAY", changedString);
	}

}
