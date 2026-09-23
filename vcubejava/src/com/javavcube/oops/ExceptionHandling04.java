package com.javavcube.oops;

public class ExceptionHandling04 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
			System.out.println(10/0);
			System.out.println("hello");
			System.out.println("food morning");
		}
		catch(Exception e) {
			System.out.println("in catch");
		}
		System.out.println("main method ended");

	}

}
