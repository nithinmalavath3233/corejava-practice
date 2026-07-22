package com.javavcube;
import java.util.Scanner;
public class Studentpercentage {
	Scanner sc=new Scanner(System.in);
  int 	obtainedmarks(int t,int h,int e,int m,int s,int so){
	  int add=t+h+e+m+s+so;
		return add;
	}
  double caluclatepercentage(int totalmarks,int obtain) {
	  double percentage=(obtain * 100)/totalmarks;
	  return percentage;
  }

	void main(String[] args) {
		System.out.println("Enter subject1 Marks:");
		int t=sc.nextInt();
		System.out.println("Enter subject2 Marks:");
		int h=sc.nextInt();
		System.out.println("Enter subject3 Marks:");
		int e=sc.nextInt();
		System.out.println("Enter subject4 Marks:");
		int m=sc.nextInt();
		System.out.println("Enter subject5 Marks:");
		int s=sc.nextInt();
		System.out.println("Enter subject6 marks:");
		int so=sc.nextInt();
		int obtain=obtainedmarks( t, h, e, m, s, so);
		System.out.println("obtained marks:"+ obtain);
		System.out.println("enter totalmarks:");
		int totalmarks=sc.nextInt();
		double p=caluclatepercentage(totalmarks,obtain);
		System.out.println("percentage is:"+p);
		
	

	}

}
