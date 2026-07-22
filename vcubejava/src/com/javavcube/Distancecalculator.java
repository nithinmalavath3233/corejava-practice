package com.javavcube;
import java.util.Scanner;
public class Distancecalculator {
	static Scanner sc=new Scanner(System.in);
	double finddistance(double speed,double time) {
		return speed*time;
	}

	 void main(String[] args) {
		System.out.println("enter speed:");
		Double s=sc.nextDouble();
		System.out.println("enter time:");
		Double t=sc.nextDouble();
		double dist=finddistance(s,t);
		System.out.println("distance:"+dist);
	}

}
