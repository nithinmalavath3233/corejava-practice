package com.javavcube.loops;

import java.util.Scanner;

public class FindLargestDigitNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");
	        int n = sc.nextInt();

	        int r=0;
            int max=0;
	        while (n > 0) {
	        	r=n%10;
	        	
	            n = n / 10;
	            max=Math.max(r, max);
	          
	        }
          System.out.println(max);
	        

	}

}
