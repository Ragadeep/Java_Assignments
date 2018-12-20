package com.MoneyMoneyBank;

public class SavingsAccount extends BankAccount {

	private boolean salary;
	
	public SavingsAccount(String name, double accountBalance, boolean salary) {
		super(name, accountBalance);
		this.salary = salary;
	}

	public boolean isSalary() {
		return salary;
	}

	public double currentAccountBalance () {
		return getAccountBalance();
	}
	
	public void withdraw(double withdrawAmmount) {
		if( accountBalance >= withdrawAmmount && withdrawAmmount > 0 ) {
			accountBalance = accountBalance - withdrawAmmount;
		}
	}
}
