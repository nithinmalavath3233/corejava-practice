package com.javavcube;

public class StaticMethods {

    public static void main(String[] args) {
        System.out.println("Main method started");
        method1();
    }

    // In static methods, we can call other static methods directly
    static void method1() {
        method2();
        System.out.println("Hello method1");
    }

    // In static methods, we need an object to call instance methods
    static void method2() {
        StaticMethods t = new StaticMethods();
        t.method3();
        System.out.println("Hello method2");
    }

    // In instance methods, we can call other instance methods directly
    void method3() {
        method4();
        System.out.println("Hello method3");
    }

    // In instance methods, we can also call static methods directly
    void method4() {
        method5();
        System.out.println("Hello method4");
    }

    // Static method
    static void method5() {
        System.out.println("Hello method5");
    }
}