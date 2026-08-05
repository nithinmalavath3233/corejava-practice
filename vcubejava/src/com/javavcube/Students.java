package com.javavcube;

public class Students {

    String StudentName;
    int rollno;

    static int age = 20;
    static String address = "hyderabad";

    public static void main(String[] args) {

        // Object 1
        Students std1 = new Students();
        std1.StudentName = "nithin";
        std1.rollno = 34;

        System.out.println("Student Name : " + std1.StudentName);
        System.out.println("Student Roll No : " + std1.rollno);
        System.out.println("Student Age : " + age);
        System.out.println("Student Address : " + address);

        System.out.println("\nObject 2 Creation");

        // Object 2
        Students std2 = new Students();
        std2.StudentName = "hemanth";
        std2.rollno = 35;

        System.out.println("Student Name : " + std2.StudentName);
        System.out.println("Student Roll No : " + std2.rollno);
        System.out.println("Student Age : " + age);
        System.out.println("Student Address : " + address);

        // Change static variables
        age = 21;
        address = "Nizamabad";

        System.out.println("\nObject 3 Creation");

        // Object 3
        Students std3 = new Students();
        std3.StudentName = "vijay";
        std3.rollno = 36;

        System.out.println("Student Name : " + std3.StudentName);
        System.out.println("Student Roll No : " + std3.rollno);
        System.out.println("Student Age : " + age);
        System.out.println("Student Address : " + address);
    }
}