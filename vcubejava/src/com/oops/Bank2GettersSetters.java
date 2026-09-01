package com.oops;

public class Bank2GettersSetters {
	public static void main(String[] args) {

        BankAccoutnt2SettersGetters account =
                new BankAccoutnt2SettersGetters();

        account.setAccountNumber(123456789);
        account.setHolderName("Nithin");
        account.setBalance(5000);

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Holder Name: " + account.getHolderName());
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
