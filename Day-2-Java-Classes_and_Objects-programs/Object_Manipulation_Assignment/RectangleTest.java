import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleTest {
	private Rectangle rectangle1;
	private Rectangle rectangle2;
	@Before
	public void setUp() {
		rectangle1 = new Rectangle();
		rectangle2 = new Rectangle();
//		rectangle1.setLength(43);
//		rectangle1.setWidth(23);
//		rectangle2.setLength(43);
//		rectangle2.setWidth(23);
		rectangle1.set(3, 5);
		rectangle2.set(5, 6);
	}
	@Test
	public void areaCheck() {
		boolean flag = Rectangle.sameArea(rectangle1, rectangle2);
		assertFalse(flag);
	}
}
