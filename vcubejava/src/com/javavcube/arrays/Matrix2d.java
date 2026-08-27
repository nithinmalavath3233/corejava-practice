package com.javavcube.arrays;
import java.util.Scanner;
public class Matrix2d {

	public static void main(String[] args) {
	//	int arr[]= {1,2,3},{4,5,6},{7,8,9};
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
      int temp=0;
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
              if(i%2==0) {
            	// int temp=0;
            	int start=0;
            	int end=n-1;
            	
            	while(start<end) {
            		temp=arr[i] [start];
            		arr[i][start]=arr[i][end];
            		arr[i][end]=temp;
            		start++;
            		end--;
            	}
            	 
            		 
            	 
              }  else if(i%2!=0 && i!=j){
              arr[i][j]*=2;
            	  
              }
          }
          //System.out.println();
      }
    for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
        	  if(i==j) {
        		  arr[j][i]=arr[j][i]*arr[j][i];
        	  }
              
          }
          System.out.println();
      }
      
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr.length; j++) {
        	  
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
      
	}

}
