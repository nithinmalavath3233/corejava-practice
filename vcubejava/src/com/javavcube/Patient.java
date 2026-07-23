package com.javavcube;
import java.util.Scanner;

public class Patient {
	static Scanner sc= new Scanner(System.in);
	
	String patientName;
	int age;
	double RoomCharge;
	int days;
	Patient(String PName,int age,Double RoomCharge,int days){
		patientName=PName;
		this.age=age;
		this.RoomCharge=RoomCharge;
		this.days=days;
		System.out.println("patient Name:"+PName);
		System.out.println("patient age:"+age);
		System.out.println("room charge per day:"+RoomCharge);
		System.out.println("number of days admited:"+days);
		//System.out.println("total hospital bill:"+total);
		
	}
	void bill(String PName,int age,Double RoomCharge,int days) {
		Double total=RoomCharge*days;
	/*	System.out.println("patient Name:"+PName);
		rahulSystem.out.println("patient age:"+age);
		System.out.println("room charge per day:"+RoomCharge);
		System.out.println("number of days admited:"+days);*/
		System.out.println("total hospital bill:"+total);
		

	}

	public static void main(String[] args) {
		System.out.println("enter patient name:");
		String PName=sc.nextLine();
		System.out.println("enter patient age:");
		int age=sc.nextInt();
		System.out.println("enter Room charge per day:");
		double RoomCharge=sc.nextDouble();
		System.out.println("enter number of days:");
		int days=sc.nextInt();
		Patient p1= new Patient(PName,age, RoomCharge,days);
		p1.bill(PName,age,RoomCharge,days);
		
		
	
	}

}
