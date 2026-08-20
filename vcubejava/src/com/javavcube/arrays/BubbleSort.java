package com.javavcube.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {99,63,45,21,8,3,1,2};
		//int arr[]= {1,2,3,4,5,6};
		System.out.println("bedore sorting:"+Arrays.toString(arr));
		int temp=0;
		int outer=0;
		int inner=0;
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
			inner++;
		}
		outer++;
		if(!flag) {
			break;
		}
		}
		System.out.println("inner:"+inner);
		System.out.println("outerr:"+outer);
		
		System.out.println("after sorting"+Arrays.toString(arr));
	

	}

}
