package com.javavcube.loops;
import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
	
		int temp=n;
		while(temp>9) {
			int sum=0;
			while(temp>0) {
				int digit=temp%10;
				sum=sum+digit;
				temp=temp/10;
			}
			temp=sum;
		}
			if(temp==1) {
				System.out.println("given number is magic number:");
			}
			else {
				System.out.println("given number not a magic number:");
			}
		
	
}

}
