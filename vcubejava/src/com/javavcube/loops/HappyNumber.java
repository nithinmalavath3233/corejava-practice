package com.javavcube.loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	
		int temp=n;
		while(temp>9) {
			int sum=0;
			int square=0;
			while(temp>0) {
				int digit=temp%10;
				//System.out.println(digit);
				square=digit*digit;
				sum=sum+square;
				temp=temp/10;
			}
			//System.out.println(sum);
			temp=sum;
		}
			if(temp==1) {
				System.out.println("given number is happy number");
			}else {
				System.out.println("given number is not happy number");
			}
		
			

	}

}
