package com.oops;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {

    String collegeName;

    Student(String name, int age, String collegeName) {

        super(name, age);   // calls parent constructor

        this.collegeName = collegeName;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(collegeName);
    }
}

public class Inheritence_constructors {

    public static void main(String[] args) {

        Student s = new Student("Nithin", 22, "MREC");

        s.display();
    }
}
