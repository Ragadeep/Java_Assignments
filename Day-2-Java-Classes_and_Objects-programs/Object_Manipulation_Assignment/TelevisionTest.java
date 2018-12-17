import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {
	private Television tv;
	@Before
	public void setUp() {
		tv = new Television();
		tv.setState(false);
		tv.setChannel(23);
//		Television tv.changeChannel(2);
	}
	@Test	
	public void changeChannel() {
//		boolean actual = tv.changeChannel();
		int finalResult = Television.changeChannel(9);
		System.out.println(finalResult);
	}
}
