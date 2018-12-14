import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GetMissingNumber {
	private GetMissingValue getNumber;
	@Before
	public void setUp(){
		getNumber = new GetMissingValue();
	}
	@Test
	public void test() {
		int[] arrayOfNumbers = {7,8,2,5,6,3};
		int missedNumber = getNumber.findNumber(arrayOfNumbers);
		assertEquals(4, missedNumber);
	}

}
