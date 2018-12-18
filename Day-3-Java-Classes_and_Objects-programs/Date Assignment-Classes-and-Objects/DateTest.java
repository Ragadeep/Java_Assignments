import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;  

public class DateTest {
	private Date date1, date2;
	@Before
	public void setUp() {
		date1 = new Date();
		date2 = new Date();
		date1.setDay(23);
		date1.setMonth(9);
		date1.setYear(1994);
		date2.setNewDate("23/8/1994");
	}
	@Test
	public void compareDate() {
		System.out.println(toString().isBefore(date2.getNewDate()));
	}


}
