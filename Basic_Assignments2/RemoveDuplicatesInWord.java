import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemoveDuplicatesInWord {
	private FindDuplicates removeDuplicates;
	@Before
	public void setup(){
		removeDuplicates = new FindDuplicates();
	}
	@Test
	public void test() {
		String afterRemovedDuplicates = removeDuplicates.duplicatesRemove("aaabbb");
		assertEquals("ab", afterRemovedDuplicates);
	}

}
