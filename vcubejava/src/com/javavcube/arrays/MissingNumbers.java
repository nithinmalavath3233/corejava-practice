package com.javavcube.arrays;
import java.util.Scanner;

public class MissingNumbers {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        System.out.print("Enter number of elements: ");
	        int size = sc.nextInt();

	        boolean[] present = new boolean[n + 1];

	        System.out.println("Enter the numbers:");

	        for (int i = 0; i < size; i++) {
	            int num = sc.nextInt();

	            if (num >= 1 && num <= n) {
	                present[num] = true;
	            }
	        }

	        System.out.println("Missing numbers:");

	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.print(i + " ");
	            }
	        }

	        sc.close();
	    }
	}