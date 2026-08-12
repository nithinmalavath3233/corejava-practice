package com.javavcube.loops;

import java.util.Scanner;

public class PerfectNumberLoops {

	 static void findfactors(int n) {
	      
	           
	        System.out.print("factors of "+n+ ":");
	        int sum=0;;
	        for (int i = 1; i <= n / 2; i++) {  
	        	
	            if (n % i == 0) {
	            	System.out.print(i+" ");
	            	 
	           sum+=i;
	            }
	       
	        }
	        System.out.println();
	        if(sum==n) {
	        System.out.print(n +"  is perfect number");
	        }
	        else {
	        	 System.out.print(n +"  is not aperfect number");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	         findfactors(n);
	        sc.close();
	    }

	

}
