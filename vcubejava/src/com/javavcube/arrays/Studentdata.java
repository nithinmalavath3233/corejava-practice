package com.javavcube.arrays;
import java.util.Scanner;
public class Studentdata {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Eneter number of Students");
		int n=sc.nextInt();
		int[][] data=new int[n][2];
		String[] names= new String[2];
		for(int i=0;i<n;i++) {
		System.out.println("\n student"+(i+1));
         System.out.print("enter Roll number:");
         data[i][0]=sc.nextInt();
         System.out.print("enter name:");
         names[i]=sc.next();
         System.out.println("enter marks number:");
         data[i][1]=sc.nextInt();
		}
		System.out.println("-----------------------------------");
		System.out.println("Rollno\tName\tMArks");
		System.out.println("-----------------------------------");
		for(int i=0;i<n;i++) {
			System.out.println(data[i][0]+"\t"+names[i]+"\t"+data[i][1]);
		}
		
		System.out.println("-----------------------------------");
	}

}
