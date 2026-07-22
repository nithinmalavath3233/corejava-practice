package com.javavcube;

public class countzeroone {

	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,0,1,0};
		int n=arr.length;
		int zerocount=0;
		int onecount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zerocount++;
			}
			else {
				onecount++;
			}
		}
		System.out.println("zerocount: "+zerocount);
		System.out.println("onecount: "+ onecount);
	}

}
