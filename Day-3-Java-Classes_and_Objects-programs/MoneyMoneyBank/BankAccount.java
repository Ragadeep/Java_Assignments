package com.MoneyMoneyBank;

public abstract class BankAccount {
	
	static int accountNumber;
	private String name;
	protected double accountBalance;
	
	static{
		accountNumber = 7321000;
	}
	{
		accountNumber++;
	}
	
	public BankAccount(String name, double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
	}
	
	public int getAccountNumber () {
		return accountNumber;
	}
	
	public String getName () {
		return name;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit (double depositAmmount) {
		this.accountBalance = depositAmmount + getAccountBalance();
	}

	public abstract double currentAccountBalance();
}