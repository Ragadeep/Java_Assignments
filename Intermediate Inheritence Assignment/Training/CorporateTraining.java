package com.Training;

public class CorporateTraining extends Training {
	
	private int days;
	
	/**
	 * 
	 * @param subject
	 * @param fees
	 * @param days
	 * Getting subject and fees from the parent class constructor and using in this class by using super keyword.
	 */
	public CorporateTraining(String subject, double fees, int days) {
		super(subject, fees);
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
	/**
	 * Overriding method from parent class and using it.
	 */
	@Override
	public double getOrderValue() {
		return getFees() * getDays();
	}
}
