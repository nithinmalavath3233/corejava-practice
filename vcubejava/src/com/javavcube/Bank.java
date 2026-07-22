package com.javavcube;

public class Bank {

     static long nextAccountNo = 10012001L;

    long accountNo;
    static String ifscCode;
    String holderName;
    Double balance;

    
    {
        accountNo = nextAccountNo++;
    }

    public static void main(String[] args) {

        ifscCode = "SBI101";

        Bank b1 = new Bank();
        b1.holderName = "Nithin";
        b1.balance = 500.0;

        System.out.println("Account No : " + b1.accountNo);
        System.out.println("IFSC Code  : " + ifscCode);
        System.out.println("Holder Name: " + b1.holderName);
        System.out.println("Balance    : " + b1.balance);

        System.out.println();

        Bank b2 = new Bank();
        b2.holderName = "Vijay";
        b2.balance = 800.0;

        System.out.println("Account No : " + b2.accountNo);
        System.out.println("IFSC Code  : " + ifscCode);
        System.out.println("Holder Name: " + b2.holderName);
        System.out.println("Balance    : " + b2.balance);
    }
}
