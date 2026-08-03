package com.javavcube;

public class Swap {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("using temp variable");
		System.out.println("A ="+a);
		System.out.println("B="+b);
		System.out.println("************************************");
		System.out.println("without using third variable");
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("A ="+a);
			System.out.println("B="+b);
			System.out.println("************************************");
			
		
			a=a^b;
			b=a^b;
			a=a^b;
       System.out.println("A="+a);
       System.out.println("B="+b);
       System.out.println("************************************");
       System.out.println(" xor");
			
       a=a^b;
		b=a^a-b;
		a=a^a-b;
		b=a^a+b^b;
		
  System.out.println("A="+a);
  System.out.println("B="+b);
			

	}

}
