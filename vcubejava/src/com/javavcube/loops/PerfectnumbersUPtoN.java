package com.javavcube.loops;
import java.util.Scanner;


public class PerfectnumbersUPtoN {

	public static void main(String[] args) {
		System.out.println("eneter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(isperfect(i)) {
				System.out.println(i);
			}
		}
		
	
	

}

	private static boolean isperfect(int n) {
		
		int sum=0;
		
		for(int j=1;j<=n/2;j++) {
			if(n%j==0) {
			//	System.out.print(i+" ");
				sum+=j;
				
			}
		}
		
		
		return sum==n;
	}
	}
