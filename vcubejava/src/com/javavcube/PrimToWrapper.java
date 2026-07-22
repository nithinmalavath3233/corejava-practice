package com.javavcube;

public class PrimToWrapper {
	

	public static void main(String[] args) {
		System.out.println("Auto boxing converting primitive to correspondin wrapper");
		int x=10;
		Integer obj=30;
		
		
		System.out.println(x);
		System.out.println(obj);
		System.out.println("Auto unboxing converting wrapper to corresponding primitive");
		Integer obj1=100;
		int y=obj1;
		System.out.println(obj1);
		System.out.println(y);
		String s="456";
		int num=Integer.parseInt(s);
		System.out.println(s);
		String s1="789.78";
		double d1=Double.parseDouble(s1);
		System.out.println(s1);
		String s3="83.5";
		float f1=Float.parseFloat(s3);
		System.out.println(s3);

	}

}
