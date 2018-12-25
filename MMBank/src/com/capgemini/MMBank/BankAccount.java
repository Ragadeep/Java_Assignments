package com.capgemini.MMBank;

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private static int increment = 0;
	
	public BankAccount(String accountHolderName,
			double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	{
		accountNumber = ++increment;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double ammount) {
		accountBalance = ammount + getAccountBalance();
	}

	public abstract void withdraw(double ammount) throws Exception;

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
}
