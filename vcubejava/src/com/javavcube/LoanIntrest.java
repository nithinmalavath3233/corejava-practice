package com.javavcube;
import java.util.Scanner;

public class LoanIntrest {
	static Scanner sc=new Scanner(System.in);
	double calculateIntrest(double principal, double rate,int time) {
		double simpleIntrest=(principal* rate*time)/100;
		System.out.println("principal amoutnt is:"+principal);
		System.out.println("rate of intrest:"+rate+"%");
		System.out.println("time :"+time+ "months");
		return simpleIntrest;
		
	}

	void main(String[] args) {
		System.out.println("main method started");
		System.out.println("enter a principal amount:");
		double principal=sc.nextDouble();
		System.out.println("enter rate of intrest:");
		double rate=sc.nextDouble();
		System.out.println("enter a time:");
		int time=sc.nextInt();
		System.out.println("simple interset is for your amount:"+calculateIntrest(principal,rate,time));
		}

}
