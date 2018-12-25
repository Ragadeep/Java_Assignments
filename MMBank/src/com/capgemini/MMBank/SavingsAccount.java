package com.capgemini.MMBank;

public abstract class SavingsAccount extends BankAccount {
	private boolean isSalaried;
	private static final double minimumBalance = 100;

	public SavingsAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public abstract void withdraw(double ammount) throws Exception;

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", isSalaried()="
				+ isSalaried() + ", getMinimumBalance()=" + getMinimumBalance()
				+ "]";
	}
	
}
