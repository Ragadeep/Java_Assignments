import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ReverseWordInString {
	private WordReverse reverse;
	@Before 
	public void setUp(){
		reverse = new WordReverse();
	}
	@Test
	public void test() {
		String afterReverse = reverse.stringReverse("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",afterReverse);
	}

}
