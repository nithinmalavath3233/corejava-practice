package com.javavcube;
import java.util.Scanner;

public class StudentResult {
	void Student(String name){
		System.out.println("student name is:"+name);
	}
	void CalculateTotal(int m1,int m2,int m3) {
		int add=m1+m2+m3;
		System.out.println("add:"+add);
		int average=add/3;
		System.out.println("average:"+average);
	}
	/*void CalculateAverage(int m1,int m2,int m3) {
		int sum=m1+m2+m3;
		
		int average=sum/3;
		System.out.println("average+",average);
	}*/

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		String sname=sc.nextLine();
		System.out.println("enter student name:");
		
		Student(sname);
		System.out.println("enter m1 value:");
		int m1=sc.nextInt();
		System.out.println("enter m2 value:");
		int m2=sc.nextInt();
		System.out.println("enter m3 value:");
		int m3=sc.nextInt();
		CalculateTotal(m1,m2,m3);
        


	}

}
