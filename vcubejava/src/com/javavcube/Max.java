package com.javavcube;

public class Max {
	public static int large(int arr[]) {
		int maxi=arr[0];
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>maxi) {
				maxi=arr[i];
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] arr= {8,3,11,7,15,21};
		System.out.println(large(arr));
	
	}

}
