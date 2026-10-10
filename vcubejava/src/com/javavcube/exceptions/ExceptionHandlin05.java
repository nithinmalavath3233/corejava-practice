package com.javavcube.exceptions;

public class ExceptionHandlin05 {

	public static void main(String[] args) {
	System.out.println("main method started");
	
		
		try {
			System.out.println("in try ");
			int x=10/0;
			String s="nithin";
			System.out.println(s.charAt(x));
			
		}
		catch(StringIndexOutOfBoundsException se ) {
			System.out.println("in catch of se");
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("in catch of ae");
		}
		
		catch(Exception e) {
			System.out.println("in catch of e");
		}
	   
		System.out.println("main method ended");
	}

}
