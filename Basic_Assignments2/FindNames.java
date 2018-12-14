import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FindNames {
	private SearchName search;
	@Before
	public void setUp(){
		search = new SearchName();
	}
	@Test
	public void test() {
		String[] arrayOfNames = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int listOfNames = search.checkName(arrayOfNames, "Sam");
		assertEquals(2, listOfNames);
	}

}
