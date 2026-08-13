package com.javavcube.loops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "enterr a number:");
		int n=sc.nextInt();
		decimalToBinary(n);
	}

	private static void decimalToBinary(int n) {
		 int r=0;
		 String  binval="";
		 while(n>0) {
			 r=n%2;
			 n=n/2;
			 binval=r+binval;
		 }
		System.out.println("binary value of given number is:"+binval);
	}

}
