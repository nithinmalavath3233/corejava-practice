package com.javavcube.oops;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a frist number");
		int n1=sc.nextInt();
		
		System.out.println("enter a second number");
		int n2=sc.nextInt();
		try {
		System.out.println(n1/n2);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("main method");
		System.out.println("main method");
		System.out.println("main method");
		System.out.println("main method");
		
		System.out.println("main method");

	}

}
