package com.javavcube;

public class BankAccounts {
	String account_holder;
	long account_no;
	double balance;
	 public BankAccounts() {
		 this("unknown");
	}

	public BankAccounts(String account_holder) {
      this("unknown",0);
	}

	public BankAccounts(String account_holder, long account_no, double balance) {
		
		this.account_holder = account_holder;
		this.account_no = account_no;
		this.balance = balance;
	}

	public BankAccounts(String account_holder, long account_no) {
		
	    this(account_holder,account_no,0.0);
	}

	public static void main(String[] args) {
		BankAccounts b1= new BankAccounts(); 
		b1.show();
		BankAccounts b2=new BankAccounts("krishna",0,0.0);
		
		b2.show();
BankAccounts b3=new BankAccounts("krishna",1234567890,0.0);
		
		b3.show();
BankAccounts b4=new BankAccounts("krishna",1234567890,500000.0);
		
		b4.show();
	}
	
     void show() {
    	 System.out.println("account holder name:"+account_holder);
    	 System.out.println("account no:"+account_no);
    	 System.out.println("balance:"+balance);
    	 System.out.println("****************************************************************");
     }
}
