package com.Training;

public class PublicTraining extends Training {
	
	private int participants;
	
	/**
	 * 
	 * @param subject
	 * @param fees
	 * @param participants
	 * Getting subject and fees from the parent class constructor and using in this class by using super keyword.
	 */
	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}
	
	/**
	 * Overriding method from parent class and using it.
	 */
	@Override
	public double getOrderValue() {
		return getFees() * getParticipants();
	}
}
