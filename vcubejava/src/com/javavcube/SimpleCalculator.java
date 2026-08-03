package com.javavcube;
import java.util.Scanner;
public class SimpleCalculator {
	 static Scanner sc= new Scanner(System.in);

	void main(String[] args) {
		System.out.println("enter fist number:");
		int n1= sc.nextInt();
		System.out.println("enter second number:");
		int n2= sc.nextInt();
		System.out.println("enter opertaor:");
		String  op= sc.next();
		//+n1+(operator)+n2
	 String s=n1+op+n2;
	 int n=Integer.parseInt(s);
	 System.out.println(s);
	System.out.println("Sample output:"+n1+op+n2);
		
		
		
		
		

	}

}
