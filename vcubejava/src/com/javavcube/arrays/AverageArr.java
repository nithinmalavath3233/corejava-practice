package com.javavcube.arrays;

public class AverageArr {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		float avg=0;
		int sum=-0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		  
		}
		avg=sum/arr.length;
System.out.println("avg: "+avg);
	}

}
