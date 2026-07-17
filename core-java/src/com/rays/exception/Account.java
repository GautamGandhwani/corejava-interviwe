package com.rays.exception;

public class Account {

	public int balance;

	int getBalance() {
		return balance;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("After Deposit = " + balance);
	}

	public void withdrawl(int amount) throws InsufficientBalance {
		balance = balance - amount;

		if (balance >= 0) {
			System.out.println("After Withdrawl = " + balance);
		} else {
			InsufficientBalance e = new InsufficientBalance();
			throw e;
		}
	}
}
