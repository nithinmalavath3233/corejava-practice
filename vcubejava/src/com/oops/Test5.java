package com.oops;

class Test5 {
    static void show(int x) {
        System.out.println("int");
    }

    static void show(long x) {
        System.out.println("long");
    }

    static void show(double x) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        show(10);
        show(10L);
        show(10.5);
    }
}
