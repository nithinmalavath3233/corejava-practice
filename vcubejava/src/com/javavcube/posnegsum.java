package com.javavcube;

public class posnegsum {

	public static void main(String[] args) {
		int arr[]= {2,-5,7,4,3,-6,2,-4};
		int n=arr.length;
		int possum=0;
		int negsum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				possum+=arr[i];
			}
			else {
				negsum+=arr[i];
			}
			
		}
		System.out.println("positivesum: "+ possum);
		System.out.println("negitivesum: "+ negsum);
		
	}

}
