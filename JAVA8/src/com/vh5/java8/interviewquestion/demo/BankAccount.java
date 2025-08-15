package com.vh5.java8.interviewquestion.demo;

public class BankAccount {

	String accountHolder;
	double balance;

	void deposit(double amt) {
		balance += amt;
	}

	void withdraw(double amt) {
		balance -= amt;
	}
}

class SavingsAccount extends BankAccount {
	double interestRate;

	void addInterest() {
		balance += balance * interestRate;
	}
	

}
