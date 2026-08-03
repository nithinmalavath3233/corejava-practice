package com.javavcube;

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int a1 = 67, b1 = 55;
		        int a2 = 86, b2 = 39;
		        int a3 = 91, b3 = 47;
		        int a4 = 88, b4 = 66;

		        // AND (&) operation
		        System.out.println("AND (&) Operations:");
		        System.out.println("67 & 55 = " + (a1 & b1));
		        System.out.println("86 & 39 = " + (a2 & b2));
		        System.out.println("91 & 47 = " + (a3 & b3));
		        System.out.println("88 & 66 = " + (a4 & b4));

		        // OR (|) operation
		        System.out.println("\nOR (|) Operations:");
		        System.out.println("67 | 55 = " + (a1 | b1));
		        System.out.println("86 | 39 = " + (a2 | b2));
		        System.out.println("91 | 47 = " + (a3 | b3));
		        System.out.println("88 | 66 = " + (a4 | b4));

		        // XOR (^) operation
		        System.out.println("\nXOR (^) Operations:");
		        System.out.println("67 ^ 55 = " + (a1 ^ b1));
		        System.out.println("86 ^ 39 = " + (a2 ^ b2));
		        System.out.println("91 ^ 47 = " + (a3 ^ b3));
		        System.out.println("88 ^ 66 = " + (a4 ^ b4));
		   
	}

}
