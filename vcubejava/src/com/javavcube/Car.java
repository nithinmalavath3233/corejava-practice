package com.javavcube;

class Vehicle {
    String brand;
    String model;
    double price;

    public Vehicle() {
        System.out.println("No-arg constructor called from Vehicle");
    }
	public Vehicle(String brand, String model, double price) {
		System.out.println("parameterize constructor called from Vehicle");

		this.brand = brand;
		this.model = model;
		this.price = price;
	}
    void vehicleInfo() { 
    	//System.out.println("parameterize constructor called from Vehicle");

    	System.out.println("brand:"+brand);
    	System.out.println("brand:"+model);
    	System.out.println("price:"+price);
    }
	
}

public class Car extends Vehicle {

    public Car() {
        System.out.println("No-arg constructor called from Car");
    }
    public Car( String brand,String model,double price) {
    	super(brand,model,price);
    	System.out.println("parameterize constructor called from mobile");
    }
    

    public static void main(String[] args) {
        System.out.println("Main method started from Car");
        //Car c = new Car();
      //  c.vehicleInfo();
        Car c1 = new Car("tata","suv",80000.0);
        c1.vehicleInfo();
        System.out.println("Main method ended");
        
    }
}
