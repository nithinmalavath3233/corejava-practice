package com.javavcube.arrays;
import java.util.*;
public class FindSmallLargeInArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		int large=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			else if(arr[i]>large){
				large=arr[i];
			}
		}
		System.out.println("small:"+small);
		System.out.println("large:"+large);

	}

}
