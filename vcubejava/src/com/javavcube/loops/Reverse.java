package com.javavcube.loops;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int rev=ReverseNum(n);
		System.out.println("Reverse of given number:"+rev);
		
	}

	private static int ReverseNum(int n) {
	        int rev=0;
	        int r=0;
	        while(n>0) {
	        	r=n%10;
	        	n=n/10;
	        	rev=rev*10+r;
	        	
	        	
	        }
		return rev;
	}

}
