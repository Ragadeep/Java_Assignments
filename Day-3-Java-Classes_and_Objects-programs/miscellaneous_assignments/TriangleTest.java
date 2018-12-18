import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	private Triangle triangle1, triangle2, triangle3, triangle4;
	@Before 
	public void setUp() {
		triangle1 = new Triangle(2, 6, 9);
		triangle2 = new Triangle(2, 6, 9);
		triangle3 = new Triangle(9, 9, 9);
		triangle4 = new Triangle(9, 9, 8);
	}
	@Test
	public void testRightAngleTriangleOrNot() {
		assertTrue(triangle1.rightAngle());
	}
	@Test
	public void testScaleneTriangleOrNot() {
		assertTrue(triangle2.scaleneAngle());
	}
	@Test
	public void testEqualaterialTriangleOrNot() {
		assertTrue(triangle3.EqualaterialTriangle());
	}
	@Test
	public void testIsoscelesTriangleOrNot() {
		assertTrue(triangle4.isIsosceles());
	}
}
