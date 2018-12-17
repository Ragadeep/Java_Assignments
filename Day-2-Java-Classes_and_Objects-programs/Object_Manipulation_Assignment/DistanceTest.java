// Program to display distance in feet and inches.
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceTest {
	private Distance distance1;					
	private Distance distance2;
	@Before
	public void setUp(){
		distance1 = new Distance(11, 8.6);					// Creating Objects.
		distance2 = new Distance(8, 7.4);
	}
	@Test
	public void finalDistance() {
		double expectedResult = 20.4;											// Expected output.
		Distance finalResult = Distance.sum(distance1, distance2);
		finalResult.display();													// Displaying results individually.
		double finalDistance =  finalResult.feet + (finalResult.inches/10);		// converting inches to feet.
		assertEquals(expectedResult, finalDistance, 0);							// Equating output value with expected value.
	}

}
