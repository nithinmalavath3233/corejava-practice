package com.javavcube;
class A {
    void display() {
        System.out.println("Hello from Class A");
    }

    public static void main(String[] args) {
        A obj1 = new A();     
        B obj2 = new B();      

        obj1.display();
        obj2.show();
    }
}

class B {
    void show() {
        System.out.println("Hello from Class B");
    }

    public static void main(String[] args) {
        B obj1 = new B();      
        A obj2 = new A();      

        obj1.show();
        obj2.display();
    }
}
