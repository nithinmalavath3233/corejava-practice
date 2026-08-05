package com.javavcube;

public class Agc {
	protected void finalize() {
		System.out.println("object destroyed from heap memory");
	}
	
	class A{
		B b;
	}
		
	
	public static void main(String[] args) {
		Agc s1=new Agc();
		System.out.println(s1);
		Agc s2 =new Agc();
		System.out.println(s2);
		s1=s2;
		new Agc();
		System.gc();
		
		
	
	}

}