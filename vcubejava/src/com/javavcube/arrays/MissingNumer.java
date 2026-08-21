package com.javavcube.arrays;

import java.util.Arrays;

public class MissingNumer {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		System.out.println(Arrays.toString(arr));
		int sum=0;
		int actualsum=0;
		int n=arr.length;
		int total=n*(n+1)/2;
		System.out.println(total);
		
		
		for(int i=1;i<=arr.length+1;i++) {
			sum+=i;
		
			
		}
		System.out.println("sum:"+sum);
		for(int i=0;i<arr.length;i++) {
			
			actualsum+=arr[i];
			
		}
		
		System.out.println("actualsum: "+actualsum);
		int diff=sum-actualsum;
		System.out.println("missing number:"+diff);
        System.out.println("missing:"+(actualsum-total));
	}

}
