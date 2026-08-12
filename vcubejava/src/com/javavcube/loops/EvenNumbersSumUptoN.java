package com.javavcube.loops;
import java.util.Scanner;
public class EvenNumbersSumUptoN {
	public static void main(String args[]) {
		System.out.println("Eneter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(iseven(i)) {
				//System.out.println(i);
				sum+=i;
			}
			
		}
		System.out.println("even sum upto n"+sum);
	}

	private static boolean iseven(int n) {
		for(int i=0;i<=n;i++) {
			if(n%2==0) {
				return true;
			}
		}
		return false;
	}

}
