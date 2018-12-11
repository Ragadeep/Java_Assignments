// This a simple program by using JUnit Test.
package java_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	
	Addition addition = new Addition(); 		// object creation for all test cases.
	@Test									
	public void TwoPositiveNUmbers() {
		int plus=addition.add(3,7);
		assertEquals(10,plus);
	}
	@Test
	public void TwoNegativeNumbers() {
		int plus=addition.add(-8,-7);
		assertEquals(-15,plus);
	}
	@Test
	public void oneNegativeNUmber() {
		int plus=addition.add(7,-7);
		assertEquals(0,plus);
	}
	@Test
	public void TwoZeros() {
		int plus=addition.add(0,0);
		assertEquals(0,plus);
	}
	@Test
	public void OnePositiveOneZero() {
		int plus=addition.add(0,7);
		assertEquals(7,plus);
	}
	@Test
	public void OneNegativeOneZero() {
		int plus=addition.add(0,-7);
		assertEquals(-7,plus);
	}
}
