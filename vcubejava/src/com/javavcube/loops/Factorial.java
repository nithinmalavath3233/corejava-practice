package com.javavcube.loops;
import java.util.Scanner;



public class Factorial {
	static long findfact(int n) {
		long fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			
			
		}
          return fact;
	}

	public static void main(String[] args) {
		System.out.println("enter a number to find factorial :");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    long n1=findfact(n);
	    System.out.println("factorial of given number is:"+n1);

	}

}
