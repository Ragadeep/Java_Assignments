import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NewItemValue {
	private DiscountPrice newPrice;
	@Before
	public void setUp(){
		newPrice = new DiscountPrice();
	}
	@Test
	public void test() {
		float discountValue = newPrice.discount(678);
		assertEquals(440, discountValue, 1);
	}

}
