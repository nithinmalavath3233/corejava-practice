package com.javavcube.loops;

import java.util.Scanner;

public class PerfectNumberLoops {

	 static void findfactors(int n) {
	      
	           
	        System.out.println("factors of "+n+":");
	        for (int i = 1; i <= n / 2; i++) {  
	        	
	            if (n % i == 0) {
	            System.out.print(i+" ");
	            }
	       
	        }
	        System.out.print(n);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	         findfactors(n);
	        sc.close();
	    }

	

}
