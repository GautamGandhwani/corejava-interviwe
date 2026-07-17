package com.rays.exception;

public class AccountTest {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(10000);
		a.deposit(1000);
		try {
			a.withdrawl(1500);
		} catch (InsufficientBalance e) {
			System.out.println(e);
		}
	}
}