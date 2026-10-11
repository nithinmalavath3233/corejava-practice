package com.javavcube.exceptions;
import java.util.Scanner;

public class ExceptionHandling06 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
	
		
		try {
			System.out.println("in try");
			int x=n1/n2;
		}
		catch(Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		System.out.println("main method ended");

	}

}
