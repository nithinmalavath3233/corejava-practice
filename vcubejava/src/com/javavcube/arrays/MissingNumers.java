package com.javavcube.arrays;

public class MissingNumers {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,7,9};
		int min=0;
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max,arr[i]);
			min=Math.min(min,arr[i]);
		
	 for(int i=min;i<max;i++) {
		 for(int j=min;i<arr.length;j++) {
			 if(arr[j]!=i) {
				 System.out.println(i);
			 }
		 }
	 }

	}

}
