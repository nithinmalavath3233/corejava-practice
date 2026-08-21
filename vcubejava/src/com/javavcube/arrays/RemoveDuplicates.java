package com.javavcube.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,1,5};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("unique Elements:");
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				continue;
			}
			System.out.print(arr[i]+" ");

	}

}
}