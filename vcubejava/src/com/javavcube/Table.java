package com.javavcube;
import java.util.Scanner;

public class Table {
	
	void multiplication(int n) {
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
			
		}
	}
		
		
	

	 void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		multiplication(n);

		
	
	}

}
