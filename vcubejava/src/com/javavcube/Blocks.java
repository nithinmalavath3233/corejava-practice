package com.javavcube;

public class Blocks {
	 Blocks t =new Blocks();
	static {
		//static Blocks t =new Blocks();

		System.out.println("static block started");
		//Blocks t =new Blocks();
		
	}
	//static Blocks t =new Blocks();

	public static void main(String[] args) {
		System.out.println("main method started");
	// Blocks t =new Blocks();
	}
	{
		System.out.println("Instance block");
	}

}
