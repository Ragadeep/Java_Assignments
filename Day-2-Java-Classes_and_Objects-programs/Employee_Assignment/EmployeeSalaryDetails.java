
public class EmployeeSalaryDetails {
	private int id;
	private String name;
	private float monthlyBasic;
	final int  medical_allowance = 1250;
	final int conveyance_allowance =800;
	public static float PFRate;
	public static float getPFRate() {
		return PFRate;
	}
	public static void setPFRate(float pFRate) {
		PFRate = pFRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(float monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public double HRA() {
		return 0.5 * getMonthlyBasic();
	}
	public double setGetPF() {
		double pf = (getPFRate()/100) * getMonthlyBasic();
		if(pf <= 6500) {
			return pf;
		}
		else {
			return 6500;
		}
	}
	public double ESIC() {
		double esic = 0.0475 * getMonthlyBasic();
		if(getMonthlyBasic() <= 5000) {
			return esic;
		}
		else {
			return 0;
		}
	}
	public float getAnnualBasic() {
		return 12 * getMonthlyBasic();
	}
	public double getMonthlyGrossSalary() { 
		return getMonthlyBasic()+HRA()+medical_allowance+conveyance_allowance;
	}
	public double professionalTax() {
		if(getMonthlyGrossSalary() <= 10000) {
			return 50;
		}
		else {
			return 100;
		}
	}
	public double getAnnualGrossSalary() {
		return 12*getMonthlyGrossSalary();
	}
	public double getMonthlyDeductions() {
		return setGetPF()+ESIC()+professionalTax();
	}
	public double getMonthlyTakeHome() {
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}
	public double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
	}
}
