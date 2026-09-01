package com.oops;

public class BankAccount {

	   private long accountNumber;
	    private String holderName;
	    private double balance;

	    // Constructor
	    BankAccount(long accountNumber, String holderName) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = 5000;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        balance = balance + amount;
	        System.out.println("Deposited: ₹" + amount);
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }
	}