package com.MoneyMoneyBank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MoneyMoneyBankTest {
	
	private BankAccount savingsAccount, savingsAccount2;
	private PaymentGateway gateway;
	
	@Test
	public void getCurrentAccountBalance () {
		savingsAccount = new SavingsAccount("Shabzan", 23000, true);
		savingsAccount2 = new SavingsAccount("priyanka", 15000, true);
		double expected = 25000;
		savingsAccount.deposit(6000);
		((SavingsAccount) savingsAccount).withdraw(4000);
		System.out.println(savingsAccount.getAccountNumber()+" "+savingsAccount.getName());
		assertEquals(expected, savingsAccount.currentAccountBalance(), 0);
	}
	
	@Test
	public void getCurrentAccountBalanceNew () {
		savingsAccount = new SavingsAccount("ragadeep", 9000, true);
		double expected = 11000;
		savingsAccount.deposit(6000);
		((SavingsAccount) savingsAccount).withdraw(4000);
		System.out.println(savingsAccount.getAccountNumber()+" "+savingsAccount.getName());
		assertEquals(expected, savingsAccount.currentAccountBalance(), 0);
	}
}
