package com.MoneyMoneyBank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyMoneyBankTest {
	
	private BankAccount savingsAccount;
	private double depositAmmount;
	
	@Test
	public void getCurrentAccountBalance () {
		savingsAccount = new SavingsAccount("Shabzan", 23000, true);
		double expected = 25000;
		savingsAccount.deposit(6000);
		((SavingsAccount) savingsAccount).withdraw(4000);
		System.out.println(savingsAccount.getAccountNumber());
		assertEquals(expected, savingsAccount.currentAccountBalance(), 0);
	}
}
