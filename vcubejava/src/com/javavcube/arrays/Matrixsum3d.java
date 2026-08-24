package com.javavcube.arrays;
import java.util.Scanner;
public class Matrixsum3d {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		
		int[][] arr=new int [n][n];
		System.out.println("enter array elements:");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		 arr[j][i]=sc.nextInt();
        	}
        	
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		 sum+=arr[j][i];
        	}
        	
        }
        
        System.out.println("sum:"+sum);
        int left=0;
        int right=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		 if(i==j) {
        			 left+=arr[j][i];
        			 
        		 }
        		 
        		 if(i+j==arr.length-1) {
        			 right+=arr[j][i];
        		 }
        	}
        	
        }
        System.out.println("left diagona element sum: "+left);
        
        System.out.println("right diagonal element sum:  "+right);
        
	}

}
