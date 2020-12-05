package com.bankaccount;

public class BankAccountTest extends BankAccount {

	public static void main(String[] args) {
		BankAccount person = new BankAccount();
		System.out.println("Account Total: $" + person.accountTotal());
		System.out.println("Deposit in Checking: $" + person.checkingDeposit(87639.65));
		System.out.println("Deposit in Savings: $" + person.savingsDeposit(54235.34));
		System.out.println("Withdrawed from Checking: $" + person.withdraw(20000.00));
		System.out.println("Checking Balance: $" + person.getCheckingBalance());
		System.out.println("Savings Balance: $" + person.getSavingsBalance());
		System.out.println("Account Total: $" + person.accountTotal());
	}

}
