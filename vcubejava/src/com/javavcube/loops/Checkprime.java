package com.javavcube.loops;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numberto check prime or not: ");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n +"   is not a prime number");
				break;
			}
			else {
				System.out.println(n +"   is a prime number");
				break;
			}
		}
		
	}

}
