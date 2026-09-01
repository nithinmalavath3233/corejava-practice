package com.oops;

public class Bank {


    public static void main(String[] args) {

        BankAccount account = new BankAccount(123456789, "Nithin");

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Final Balance: ₹" + account.getBalance());
    }

}
