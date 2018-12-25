package com.capgemini.MMBank;

public class MMSavingsAccount extends SavingsAccount {
	private static final double minimumBalance = 100;
	
	public MMSavingsAccount(String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountHolderName, accountBalance, isSalaried);
	}
	
	@Override
	public void withdraw(double ammount) throws Exception {
		if(ammount < 0) {
			throw new Exception("Invalid Input");
		}
		else if(ammount > getAccountBalance()) {
			throw new InsufficientFundsException("Insufficient Funds");
		}
		else {
			setAccountBalance(getAccountBalance() - ammount);
		}	
	}

	@Override
	public String toString() {
		return "MMSavingsAccount [isSalaried()=" + isSalaried()
				+ ", getMinimumBalance()=" + getMinimumBalance()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
