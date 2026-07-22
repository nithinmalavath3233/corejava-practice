package com.javavcube;

public class Average {
	
	
	public static double getAvg (int[] arr) {
		double sum=0;
		for(int i:arr) {
			sum+=i;
		}
		int n=arr.length;
		double avg=sum/n;
		return avg;
		
		
	}

	public static void main(String[] args) {
		int[]arr= {2,3,4,6};
		System.out.println(getAvg(arr));

	}

}
