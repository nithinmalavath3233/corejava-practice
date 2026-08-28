
package com.javavcube.arrays;

// This class is in the SAME PACKAGE as
// TestAccessModifires1.
//
// TestAccessModifires1 package:
// com.javavcube.arrays
//
// Accessmodfiers02 package:
// com.javavcube.arrays
//
// Therefore:
// private  -> ❌ Not accessible
// default  -> ✅ Accessible
// protected -> ✅ Accessible
// public   -> ✅ Accessible

public class Accessmodfiers02 {

    public static void main(String[] args) {

        // Creating object of TestAccessModifires1.
        TestAccessModifires1 emp1 = new TestAccessModifires1();


        // =====================================================
        // PRIVATE
        // =====================================================
        // These are commented because private members
        // cannot be accessed from another class.
        //
        // Even though both classes are in the same package,
        // PRIVATE does NOT allow package-level access.
        //
        // ❌ Compile-time error
        //
        // System.out.println(emp1.eid);
        // System.out.println(emp1.ename);
        // emp1.method1();


        // =====================================================
        // DEFAULT
        // =====================================================
        // Default members CAN be accessed because
        // Accessmodfiers02 is in the SAME PACKAGE.
        //
        // Same package = YES
        emp1.method2();

        System.out.println(emp1.eid2);
        System.out.println(emp1.ename2);


        System.out.println("-----------------------------------------------------------------------");


        // =====================================================
        // PUBLIC
        // =====================================================
        // Public members can be accessed from anywhere.
        //
        // Same package or different package does not matter.
        emp1.method3();

        System.out.println(emp1.eid3);
        System.out.println(emp1.ename3);
    }
}


