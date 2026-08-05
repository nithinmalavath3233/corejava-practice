package com.javavcube;

public class Objcount {
	static int count=0;
	{
		count++;
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Objcount obj1 =new Objcount();
		Objcount obj2= new Objcount();
		Objcount obj3=new Objcount();
		Objcount obj4=new Objcount();
		System.out.println(count);
		

	}

}
