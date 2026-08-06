package com.javavcube.loops;

import java.util.Scanner;

public class FactorialRecursion {

	

static int fact(int n) {
    if(n==1 || n==0) {
    	return 1;
    }
	
      return n*fact(n-1);
}

public static void main(String[] args) {
	System.out.println("enter a number to find factorial :");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int n1=fact(n);
    System.out.println("factorial of given number is:"+n1);

}

}
