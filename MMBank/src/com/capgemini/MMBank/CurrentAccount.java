package com.capgemini.MMBank;

public abstract class CurrentAccount extends BankAccount {
	private final double creditLimit;

	public CurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	@Override 
	public abstract void withdraw(double ammount) throws InsufficientFundsException;

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", getCreditLimit()=" + getCreditLimit() + "]";
	}

}
