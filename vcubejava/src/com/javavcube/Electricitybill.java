package com.javavcube;
import java.util.*;

public class Electricitybill {
	static Scanner sc=new Scanner(System.in);
	double calculateBill(int units,double rate) {
		
		return units*rate;
		
	}
	void main(String[] args) {
	
	System.out.println("Enter units :");
	  int units=sc.nextInt();
		System.out.println("Enter rate :");
        double rate=sc.nextDouble();
     System.out.println("Total bill amount is:"+ calculateBill(units,rate));
        
     
	}

}
