package com.javavcube.oops;

public class ExceptionHandling02 {

	public static void main(String[] args) {
	       String s=null;
	        String s1="null";
	        String s2="";
	        System.out.println(s2.length());
	        System.out.println(s1.length());
	       
	        try {
	        	System.out.println("try block");
	        	 System.out.println(s.length());	
	        }
	        catch(NullPointerException ne){

	        	System.out.println(ne.getMessage());
	        	System.out.println(ne.toString());
	        	
	        }
	        
	        System.out.println("main method ended");

	        System.out.println("main method ended");

	        System.out.println("main method ended");



	}

}
