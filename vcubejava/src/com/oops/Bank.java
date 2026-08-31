package com.oops;

public class Bank {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();

         b1.setAccountno("284310930hdks");
         b1.setHoldername("nithin");
         b1.setBalance(5000);
         
         System.out.println(b1.getaccountno());
         System.out.println(b1.getHoldername());
         System.out.println(b1.getBalance());
         double amoutnt=b1.getBalance();
         b1.withdrawl(500.0);
         b1.deposit(400);
        
        public double withdrawl(double withdraw)
         if(withdraw<=amount) {
        	 amount=amount-withdraw;
         }
         return amount;
         
         }
         
         
         
	}

}
