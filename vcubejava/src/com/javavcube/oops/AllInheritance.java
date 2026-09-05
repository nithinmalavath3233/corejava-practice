package com.javavcube.oops;


//1. SINGLE INHERITANCE
class Animal {

 void eat() {
     System.out.println("Animal eats");
 }
}

class Dog extends Animal {

 void bark() {
     System.out.println("Dog barks");
 }
}


//2. MULTILEVEL INHERITANCE
class GrandParent {

 void property() {
     System.out.println("GrandParent has property");
 }
}

class Parent extends GrandParent {

 void house() {
     System.out.println("Parent has a house");
 }
}

class Child extends Parent {

 void bike() {
     System.out.println("Child has a bike");
 }
}


//3. HIERARCHICAL INHERITANCE
class Vehicle {

 void start() {
     System.out.println("Vehicle starts");
 }
}

class Car extends Vehicle {

 void drive() {
     System.out.println("Car drives");
 }
}

class Bike extends Vehicle {

 void ride() {
     System.out.println("Bike rides");
 }
}


//4. MULTIPLE INHERITANCE USING INTERFACES
interface Father {

 void fatherProperty();
}

interface Mother {

 void motherProperty();
}

class Son implements Father, Mother {

 public void fatherProperty() {
     System.out.println("Son gets father's property");
 }

 public void motherProperty() {
     System.out.println("Son gets mother's property");
 }
}


//5. HYBRID INHERITANCE USING INTERFACES
interface A {

 void methodA();
}

interface B extends A {

 void methodB();
}

interface C {

 void methodC();
}

class D implements B, C {

 public void methodA() {
     System.out.println("Method A");
 }

 public void methodB() {
     System.out.println("Method B");
 }

 public void methodC() {
     System.out.println("Method C");
 }
}


//MAIN CLASS
public class AllInheritance {

 public static void main(String[] args) {

     System.out.println("----- Single Inheritance -----");

     Dog d = new Dog();
     d.eat();
     d.bark();


     System.out.println("\n----- Multilevel Inheritance -----");

     Child c = new Child();
     c.property();
     c.house();
     c.bike();


     System.out.println("\n----- Hierarchical Inheritance -----");

     Car car = new Car();
     car.start();
     car.drive();

     Bike bike = new Bike();
     bike.start();
     bike.ride();


     System.out.println("\n----- Multiple Inheritance -----");

     Son s = new Son();
     s.fatherProperty();
     s.motherProperty();


     System.out.println("\n----- Hybrid Inheritance -----");

     D obj = new D();
     obj.methodA();
     obj.methodB();
     obj.methodC();
 }
}