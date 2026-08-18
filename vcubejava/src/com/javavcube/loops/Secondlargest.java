package com.javavcube.loops;
import java.util.Scanner;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int r=0;
		int large=0;
		int second=0;
		while(n>0) {
			r=n%10;
			n=n/10;
		
			if(r>large) {
				second=large;
				large=r;
				
			}
			else if(r<large && r>second) {
				second=r;
			}
		}
		System.out.println("Second Larget digit: "+second);

	}

}
