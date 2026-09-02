package com.oops;

class Person {

    public void name(String pname) {
        System.out.println("Name: " + pname);
    }

    public void ages(int age) {
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    public void CollegeNames(String cname) {
        System.out.println("College: " + cname);
    }
}

public class Inheritence_constructors {

    public static void main(String[] args) {

       Person p1 =new Person();

       p1.name("Nithin");
       p1.ages(22);
        Student s1 = new Student();

        s1.name("Nithin");
        s1.ages(22);
        s1.CollegeNames("MREC");
    }
}
