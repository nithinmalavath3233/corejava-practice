package com.javavcube;
import java.util.Scanner;


public class Salary {
	static Scanner sc=new Scanner(System.in);
	void slipSalary(String emp_Name,Double sal) {
		
		double HRA=sal*20/100;
		
		double DA=sal*10/100;
		double Gross_sal=sal+HRA+DA;
		System.out.println("Employee Name:"+ emp_Name);
		System.out.println("Basic Salary:"+sal);
		System.out.println("HRA(20)%:"+HRA);
		System.out.println("DA(10)%:"+DA);
		System.out.println("Gross salary:"+Gross_sal);
		
		
	}

	 void main(String[] args) {
		System.out.println("enter amployee name:");
		String emp_Name=sc.nextLine();
		System.out.println("enter employee salary:");
		double sal=sc.nextDouble();
		slipSalary(emp_Name,sal);
		

	}

}
