package com.javavcube.arrays;

import java.util.Scanner;

public class Matrixreplace {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter array size:");
 int n = sc.nextInt();

 int[][] arr = new int[n][n];

 System.out.println("Enter elements:");


 for (int i = 0; i < arr.length; i++) {
     for (int j = 0; j < arr.length; j++) {
         arr[i][j] = sc.nextInt();
     }
 }
	
 for (int i = 0; i < arr.length; i++) {
     for (int j = 0; j < arr.length; j++) {
         System.out.print(arr[i][j] + " ");
     }
     System.out.println();
 }
 
 
 for (int i = 0; i < arr.length; i++) {
     for (int j = 0; j < arr.length; j++) {
         if(arr[i][j]%2==0) {
        	 arr[i][j]=0;
         }
         else {
        	 arr[i][j]=-1;
         }
     }
     
 }
 System.out.println("**************************************************************");

 for (int i = 0; i < arr.length; i++) {
     for (int j = 0; j < arr.length; j++) {
         System.out.print(arr[i][j] + " ");
     }
     System.out.println();
 }
 
	}

}
