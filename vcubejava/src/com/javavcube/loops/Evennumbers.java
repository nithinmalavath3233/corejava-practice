package com.javavcube.loops;

public class Evennumbers {
	public static void main(String args[]) {
		int n=100;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			
		}
		System.out.print("sum 1 t0 100:"+sum);
	}

}
