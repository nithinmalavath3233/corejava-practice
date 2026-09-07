package com.javavcube.loops;

class Parent {

    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        Parent obj = new Parent();

        // obj.privateVar;   // ❌ Cannot access private outside Parent

        System.out.println("Default: " + obj.defaultVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Public: " + obj.publicVar);

        // Accessing private variable through a public method
        obj.display();
    }
}