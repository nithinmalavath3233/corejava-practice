package com.oops;

  class Vehicle{
	public static void  start(){
		System.out.println(" vehicles  has a tyres");
		 
	 }
	
}
  class Car extends Vehicle{
	 // @Overide
	 public static void start() {
		 System.out.println(" car  has fout tyres");
		 
	 }
	 public static void  drive() {
		 System.out.println("you can drive if u have leicense");
		 
	 }
	
}

public class Inheritence01 {

	public static void main(String[] args) {
	Car c1 = new Car();
      c1.start();
	}

}
