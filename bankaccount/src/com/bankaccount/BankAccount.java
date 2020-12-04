package com.bankaccount;

public class BankAccount {
//	Attributes
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts;
	private static double totalMoneyStored;
	
//	Constructor
	BankAccount() {
		this.accountNumber = genAccountNumber();
		numberOfAccounts++;
	}
	
//	Methods
	private String genAccountNumber() {
		String accountNumber = "";
		for (int i = 0; i < 10; i++) {
			int gen = (int) (Math.random() * 9);
			accountNumber = accountNumber + gen;
		}
		return accountNumber;
	}
}
