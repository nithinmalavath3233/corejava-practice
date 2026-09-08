package com.javavcube.oops;

public class Abstraction {
	

	abstract class Vehicle {

	    // Abstract method
	    abstract void start();

	    // Concrete method
	    void stop() {
	        System.out.println("Vehicle stopped");
	    }
	}

	class Car extends Vehicle {

	    // Providing implementation for abstract method
	    void start() {
	        System.out.println("Car starts with key");
	    }
	}

	public class Abstraction {

	    public static void main(String[] args) {

	        Vehicle v = new Car();

	        v.start();
	        v.stop();
	    }
	}





