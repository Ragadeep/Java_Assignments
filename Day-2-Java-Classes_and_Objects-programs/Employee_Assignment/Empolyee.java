import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Empolyee {
	private EmployeeSalaryDetails employee1;
	@Before 
	public void setUp(){
		employee1 = new EmployeeSalaryDetails();
		employee1.setId(101);
		employee1.setName("Ragadeep");
		employee1.setMonthlyBasic(50000);
		employee1.setPFRate(10);
	}
	@Test
	public void AnnualBasic() {
		assertEquals(600000, employee1.getAnnualBasic(), 0);
	}
	@Test
	public void MonthlyGrossSalary() {
		assertEquals(77050, employee1.getMonthlyGrossSalary(), 0);
	}
	@Test
	public void AnnualGrossSalary() {
		assertEquals(924600, employee1.getAnnualGrossSalary(), 0);
	}
	@Test
	public void MonthlyDeductions() {
		assertEquals(5100, employee1.getMonthlyDeductions(), 0);
	}
	@Test
	public void MonthlyTakeHome() {
		assertEquals(71950, employee1.getMonthlyTakeHome(), 0);
	}
	@Test
	public void AnnualTakeHome() {
		assertEquals(863400, employee1.getAnnualTakeHome(), 0);
	}
}
