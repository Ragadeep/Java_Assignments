// Program to display time in hours and minutes.
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TimeTest {
	public Time time1;
	public Time time2;
	@Before 
	public void setUp() {
		time1 = new Time(3, 55);							// Creating Objects.
		time2 = new Time(2, 35);
	}
	@Test
	public void totalTime() {
		String expectedTime = "6:30";													// Expected output.
		Time finalResult = Time.sum(time1, time2);										// Displaying hours and minutes individually.
		finalResult.display();	
		assertEquals(expectedTime, finalResult.hours+":"+finalResult.minutes);			// Equating output value with expected Time.
	}

}
