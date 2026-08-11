package com.javavcube.loops;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		
			if(isPrime(n)) {
			System.out.print(n+"  is prime a number") ;
			
		}
			else {
				System.out.print(n+"  is not  prime  number") ;
			
			}
		
	  
	}
	static boolean isPrime(int n) {
		
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return status;
		
	}

}
