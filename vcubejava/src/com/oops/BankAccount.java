package com.oops;

public class BankAccount {

	private String holdername;
	private String accountno;
	private double balance;
	
		public void setHoldername(String holdername) {
			this.holdername=holdername;
			
		}
	
		public String getHoldername() {
			return holdername;
		}
		public void setAccountno(String accountno) {
			this.accountno=accountno;
			

	}
		public String getaccountno() {
			return accountno;
		}
		public void setBalance(double balance) {
			this.balance=balance;
			

	}
		public double getBalance() {
			return balance;
		}
		double amount=balance;
		 public double withdrawl(double withdraw)
         if(withdraw<=amount) {
        	 amount=amount-withdraw;
         }
         else {
        	 System.out.println("insufficient balance");
         }
         return amount;
         
         }



}
