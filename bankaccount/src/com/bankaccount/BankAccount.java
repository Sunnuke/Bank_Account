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
	
//	All Methods (Below)
	private String genAccountNumber() {
		String accountNumber = "";
		for (int i = 0; i < 10; i++) {
			int gen = (int) (Math.random() * 9);
			accountNumber = accountNumber + gen;
		}
		return accountNumber;
	}
//	Deposit
	public double checkingDeposit(double amount) {
		totalMoneyStored += amount;
		setCheckingBalance(amount);
		return amount;
	}
	public double savingsDeposit(double amount) {
		totalMoneyStored += amount;
		setSavingsBalance(amount);
		return amount;
	}
	
	public double withdraw(double amount) {
		if (amount > checkingBalance) {
			System.out.println("Insufficient Funds!");
			return 0;
		}
		checkingBalance -= amount;
		totalMoneyStored -= amount;
		return amount;
	}
	
	public double accountTotal() {
		return getCheckingBalance() + getSavingsBalance();
	}

//	Checking Balance
	public double getCheckingBalance() {
		return checkingBalance;
	}

	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance += checkingBalance;
	}

//	Savings Balance
	public double getSavingsBalance() {
		return savingsBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance += savingsBalance;
	}
}
