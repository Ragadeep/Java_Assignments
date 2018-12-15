import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexTest {
	public Complex complex1;
	public Complex complex2;
	@Before
	public void setUp() {
		complex1 = new Complex(7.8, 8.8);
		complex2 = new Complex(8.3, 7.8);
	}
	@Test
	public void sum() {
		String expectedResult = "16.1+16.6i";
		Complex finalResult = Complex.sum(complex1, complex2);
		finalResult.display();
		assertEquals(expectedResult, finalResult.real+"+"+finalResult.imaginary+"i");
	}

}
