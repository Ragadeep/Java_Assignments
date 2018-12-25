package com.capgemini.MMBank;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
	}

	@Override
	public void withdraw(double ammount) throws InsufficientFundsException {
		if(ammount <= getAccountBalance() + getCreditLimit() && ammount > 0){
			setAccountBalance(getAccountBalance() - ammount);
		}else if(ammount<=0){
			throw new InvalidInputException("Invalid Input");
		}
		else if(ammount > getAccountBalance() + getCreditLimit()){
			throw new InsufficientFundsException("Insufficient Funds ");
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
