package com.javavcube.loops;
import java.util.Scanner;

public class EvenOdd {
	
		static void findEvenNumbers(int n) {
			System.out.println("Even numbers:");
			for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
				
			}
			System.out.println();
		}
			static void findOddNumbers(int n) {
				System.out.println("odd numbers:");
				for(int i=1;i<=n;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
					
				}
				System.out.println();
		}
	public static void main(String args[]) {
	      System.out.println("enter a number:");
	 
	 Scanner sc=new Scanner (System.in);
	      int n=sc.nextInt();
	      findOddNumbers(n);
	      
	     
	      findEvenNumbers(n);
	      
	     // findOddNumbers(n);
	}
  
}
