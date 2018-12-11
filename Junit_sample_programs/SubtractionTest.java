//This is a sample program by using @Before and @After in JUnit.
//BeforeClass and AfterClass is executed only once. And methods print between Before and After classes.
package java_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SubtractionTest {
	private Subtraction subtraction;
	@BeforeClass
	public static void before(){
		System.out.println("Before Class");
	}
	@AfterClass
	public static void after(){
		System.out.println("After Class");
	}
	@Before
	public void setUp(){
		System.out.println("Before");
		subtraction = new Subtraction();
	}
	// destroying the addition object
	@After
	public void tearUp(){
		subtraction = null;
		System.out.println("After");
	}
	@Test
	public void TwoPositiveNumbers() {
		int minus = subtraction.sub(15,5);
		assertEquals(10, minus);
	}
	@Test
	public void OneNegativeNumber() {
		int minus = subtraction.sub(-15,5);
		assertEquals(-20, minus);
	}
	@Test
	public void TwoNegativeNumbers() {
		int minus = subtraction.sub(-5,-9);
		assertEquals(4, minus);
	}
	@Test
	@Ignore
	public void TwoZeros() {
		int minus = subtraction.sub(0,0);
		assertEquals(0, minus);
	}
	@Test
	public void OneZeroOnePositive() {
		int minus = subtraction.sub(0,5);
		assertEquals(-5, minus);
	}
	@Test
	public void OneZeroOneNagative() {
		int minus = subtraction.sub(-15,0);
		assertEquals(-15, minus);
	}
}
