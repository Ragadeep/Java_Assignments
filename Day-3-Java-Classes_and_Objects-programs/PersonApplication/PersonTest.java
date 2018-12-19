/**
 *  Find the age gap between 
 */
package PersonApplication;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	
	public Person personOne, personTwo;
	
	@Before
	 public void setUp() {
		personOne = new Person( "Raga", 05,06,1996 );
		personTwo = new Person( "Shabzan",30,03,2004);
	}

	@Test
	public void twoPersonAgeDifference() {
		String expected = "25 days 9 months 7 years";
		String result = personOne.olderOne(personOne, personTwo);
		assertEquals(expected,result);
	}
}
