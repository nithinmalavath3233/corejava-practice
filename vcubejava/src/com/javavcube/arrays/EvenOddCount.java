package com.javavcube.arrays;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int EvenCount=0;
		int OddCount=0;
		 for(int i=0;i<n;i++) {
			 if(arr[i]%2==0) {
				 EvenCount++;
			 }
			 else {
				OddCount++; 
			 }
		 }
  System.out.println("even Count"+EvenCount);
  System.out.println("odd Count"+OddCount);
	}

}
