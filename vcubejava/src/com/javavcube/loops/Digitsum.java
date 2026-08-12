package com.javavcube.loops;
import java.util.Scanner;
public class Digitsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int sum=digitsum(n);
		System.out.println("digit sum of given number "+ sum);
		

	}
	static int digitsum(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		
		}
		return sum;
	}

}
   