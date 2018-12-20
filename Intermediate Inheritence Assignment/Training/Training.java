package com.Training;

public abstract class Training {
	
	protected static int studentId;
	protected String subject;
	protected double fees;
	int counter = 0;
	
	static{
		studentId = 1400;
	}
	{
		studentId++;
	}

	public Training (String subject, double fees) {
		this.subject = subject;
		this.fees = fees;
	}

	public String getSubject() {
		return subject;
	}

	public double getFees() {
		return fees;
	}

	public abstract double getOrderValue();
}
