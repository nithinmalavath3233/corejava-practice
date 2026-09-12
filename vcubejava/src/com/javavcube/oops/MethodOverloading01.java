package com.javavcube.oops;

public class MethodOverloading01 {

    void main() {

        System.out.println("main method started");
            addition();
        addition(20, 50);
    }

//    void addition(int a, int b) {
//
//        System.out.println("int two arg method called "+  "+ "a="+ a +" b="+ b );
//
//    }

//    void addition(int a, float b) {
//
//        System.out.println("int-float two arg int method called "+ "a="+ a +" b="+ b);
//    }

    void addition(float a, int b) {

        System.out.println("float-int two arg int method called  "+ "a="+ a +" b="+ b );

    }

    void addition(float a, float b) {

        System.out.println("float-float two arg int method called  "+ "a="+ a +" b="+ b);

    }
    void addition() {

        System.out.println("no arg int method called  ");

    }

}