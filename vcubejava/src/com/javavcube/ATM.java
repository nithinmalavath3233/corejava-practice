package com.javavcube;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.println("1. Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.print("Enter choice: ");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Balance: ₹5000");
	                break;
	            case 2:
	                System.out.println("Money Deposited");
	                break;
	            case 3:
	                System.out.println("Money Withdrawn");
	                break;
	            default:
	                System.out.println("Invalid Choice");
	        }

	        sc.close();

	}

}
