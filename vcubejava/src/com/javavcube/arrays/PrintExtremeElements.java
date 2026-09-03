package com.javavcube.arrays;

public class PrintExtremeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5};
       int i=0;
       int j=arr.length-1;
       while(i<=j) {
           	if(i==j) {
           		System.out.println(arr[i]+" ");
           		break;
           	}
           	else{
           	System.out.print(arr[i]+" ");
           	i++;
           	System.out.print(arr[j]+" ");
           	j--;
           	}
       }
	}

}
