
public class Date {
	private int day;
	private int month;
	private int year;
	private String newDate;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String toString() {
		return  getDay()+"/"+getMonth()+"/"+getYear();
	}
	public int compareDate(String newDate) {
		return (newDate.compareTo(toString()));
	}
//	public boolean isSmaller() {
//		if()
//	}
	public String getNewDate() {
		return newDate;
	}
	public void setNewDate(String newDate) {
		this.newDate = newDate;
	}
}
