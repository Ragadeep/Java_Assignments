package PersonApplication;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	
	private String name;
	private int day;
	private int month;
	private int year;
	
	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Person() {
	}

	public String olderOne(Person personOne, Person personTwo) {
		LocalDate firstDate = LocalDate.of(personOne.year, personOne.month, personOne.day);
		LocalDate secondDate = LocalDate.of(personTwo.year, personTwo.month, personTwo.day);
		Period diff = Period.between(firstDate, secondDate);
		return diff.getDays()+" days "+diff.getMonths()+" months "+ diff.getYears()+" years";
	}
}
