package com.javavcube.arrays;

public class TwoDArr {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[1][3]=80;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int n1[]:arr) {
			for(int num:n1) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
