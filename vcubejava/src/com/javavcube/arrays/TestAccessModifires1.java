
package com.javavcube.arrays;

// This is the parent/base class.
// This class contains examples of all 4 access modifiers.

public class TestAccessModifires1 {

    // =========================================================
    // STATIC BLOCK
    // =========================================================
    // Static block belongs to the CLASS.
    // It executes automatically when the class is loaded.
    // It executes only ONCE.
    // It executes before main().
    static {
        System.out.println("static block called from TestAccessModifiers1");
    }


    // =========================================================
    // INSTANCE BLOCK
    // =========================================================
    // Instance block belongs to OBJECT.
    // It executes every time an object is created.
    // It executes BEFORE the constructor.
    {
        System.out.println("instance block called from TestAccessModifiers1");
    }


    // =========================================================
    // PROTECTED VARIABLES
    // =========================================================
    // protected members can be accessed:
    //
    // 1. Inside the same class
    // 2. From another class in the same package
    // 3. From a subclass in another package
    //
    // We will see these cases in the other two classes.
    protected int eid4 = 4;

    protected String ename4 = "vikram";


    // =========================================================
    // PRIVATE VARIABLES
    // =========================================================
    // private members can be accessed ONLY inside this class.
    //
    // Another class cannot directly access eid and ename.
    private int eid = 18;

    private String ename = "krishna";


    // =========================================================
    // PUBLIC VARIABLES
    // =========================================================
    // public members can be accessed from anywhere,
    // provided the class itself is accessible.
    public int eid3 = 2;

    public String ename3 = "dhoni";


    // =========================================================
    // DEFAULT VARIABLES
    // =========================================================
    // No modifier = DEFAULT access modifier.
    //
    // Default members can be accessed:
    // 1. Inside the same class
    // 2. From another class in the SAME PACKAGE
    //
    // They CANNOT be accessed from another package.
    int eid2 = 1;

    String ename2 = "ram";


    // =========================================================
    // PROTECTED METHOD
    // =========================================================
    // protected method follows the same rules as
    // protected variables.
    protected static void method4() {
        System.out.println("protected method called");
    }


    // =========================================================
    // PRIVATE METHOD
    // =========================================================
    // private method can be accessed ONLY inside this class.
    private static void method1() {
        System.out.println("private method called");
    }


    // =========================================================
    // DEFAULT METHOD
    // =========================================================
    // No modifier = DEFAULT.
    //
    // This method can be accessed inside this class
    // and from another class in the same package.
    static void method2() {
        System.out.println("default method called");
    }


    // =========================================================
    // PUBLIC METHOD
    // =========================================================
    // public method can be accessed from any package.
    public static void method3() {
        System.out.println("public method called");
    }


    // =========================================================
    // CONSTRUCTOR
    // =========================================================
    // Constructor name must be the same as class name.
    // Constructor has NO return type.
    //
    // It executes automatically when an object is created.
    public TestAccessModifires1() {
        System.out.println("no arg constructor called");
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================
    public static void main(String[] args) {

        // Creating object.
        //
        // During object creation:
        //
        // 1. Instance block executes
        // 2. Constructor executes
        //
        // Static block was already executed when the class loaded.
        TestAccessModifires1 emp1 = new TestAccessModifires1();


        // =====================================================
        // PRIVATE
        // =====================================================
        // We CAN access private members here because
        // main() is inside the SAME CLASS.
        emp1.method1();

        System.out.println(emp1.eid);
        System.out.println(emp1.ename);


        System.out.println("-----------------------------------------------------------------------");


        // =====================================================
        // DEFAULT
        // =====================================================
        // We can access default members because we are
        // inside the SAME CLASS.
        emp1.method2();

        System.out.println(emp1.eid2);
        System.out.println(emp1.ename2);


        System.out.println("-----------------------------------------------------------------------");


        // =====================================================
        // PUBLIC
        // =====================================================
        // Public members can be accessed from anywhere.
        emp1.method3();

        System.out.println(emp1.eid3);
        System.out.println(emp1.ename3);


        System.out.println("-----------------------------------------------------------------------");


        // =====================================================
        // PROTECTED
        // =====================================================
        // We can access protected members because we are
        // inside the SAME CLASS.
        emp1.method4();

        System.out.println(emp1.eid4);
        System.out.println(emp1.ename4);
    }
}

