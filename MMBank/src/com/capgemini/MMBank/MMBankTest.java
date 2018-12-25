package com.capgemini.MMBank;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class MMBankTest {
	private BankAccount currentAccount, savingsAccount;
	private BankFactory mmBankFactory;

	@Test(expected = InvalidInputException.class)
	public void currentAccountNegativeAmmountCheck() {
		Logger logger = Logger.getLogger(MMBankFactory.class.getName());
		BankFactory mmBankFactory = new MMBankFactory();
		MMCurrentAccount mmCurrentAccount = (MMCurrentAccount) mmBankFactory
				.getNewCurrentAccount("Ragadeep", 3000, 1000);

		try {
			mmCurrentAccount.withdraw(-10);
			logger.info("Invalid Input Exception");
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void currentAccount() {
		mmBankFactory = new MMBankFactory();
		MMCurrentAccount mmCurrentAccount = (MMCurrentAccount) mmBankFactory
				.getNewCurrentAccount("ragadeep", 10000, 5000);
		double expected = 11000;
		try {
			mmCurrentAccount.withdraw(2000);
			mmCurrentAccount.deposit(3000);
			assertEquals(expected, mmCurrentAccount.getAccountBalance(), 0);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void savingsAccount() {
		mmBankFactory = new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount) mmBankFactory
				.getNewSavingsAccount("ragadeep", 39000, true);
		double expected = 44000;

		try {
			mmSavingsAccount.withdraw(5000);
			mmSavingsAccount.deposit(10000);
			assertEquals(expected, mmSavingsAccount.getAccountBalance(), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
