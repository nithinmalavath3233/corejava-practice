
package com.accessmodifiers;

// Importing the parent class from another package.
import com.javavcube.arrays.TestAccessModifires1;


// This class is in a DIFFERENT PACKAGE.
//
// Parent:
// com.javavcube.arrays
//
// Child:
// com.accessmodifiers
//
// But TestAccessmodifiers03 EXTENDS TestAccessModifires1.
//
// Therefore TestAccessmodifiers03 is a SUBCLASS of
// TestAccessModifires1.

public class TestAccessmodifiers03 extends TestAccessModifires1 {

    public static void main(String[] args) {


        // =====================================================
        // OBJECT OF PARENT CLASS
        // =====================================================
        // Here emp1 is a reference/object of the PARENT class.
        //
        // TestAccessModifires1 is from another package.
        TestAccessModifires1 emp1 = new TestAccessModifires1();


        // =====================================================
        // PUBLIC
        // =====================================================
        // Public members can be accessed from ANY package.
        //
        // Therefore this works.
        emp1.method3();

        System.out.println(emp1.eid3);
        System.out.println(emp1.ename3);


        System.out.println("-----------------------------------------------------------------------");


        // =====================================================
        // PROTECTED USING PARENT OBJECT
        // =====================================================
        // These are commented because they will give
        // COMPILE-TIME ERROR.
        //
        // Why?
        //
        // We are in a DIFFERENT PACKAGE.
        //
        // Although TestAccessmodifiers03 is a subclass,
        // protected access from another package has a special rule.
        //
        // The protected member must be accessed through
        // the CHILD CLASS type/reference, not through an
        // ordinary parent-class reference.
        //
        // ❌ NOT allowed:
        //
        // emp1.method4();
        // System.out.println(emp1.eid4);
        // System.out.println(emp1.ename4);


        // =====================================================
        // OBJECT OF CHILD CLASS
        // =====================================================
        // Creating object of the CHILD class.
        //
        // TestAccessmodifiers03 extends TestAccessModifires1,
        // so the child object has access to inherited protected
        // members.
        TestAccessmodifiers03 emp4 = new TestAccessmodifiers03();


        // =====================================================
        // PROTECTED USING CHILD OBJECT
        // =====================================================
        // This works because:
        //
        // 1. TestAccessmodifiers03 is a SUBCLASS
        // 2. method4() is PROTECTED
        // 3. The child class is accessing the protected member
        //    through a CHILD-CLASS reference.
        //
        // Therefore this is allowed.
        emp4.method4();

        System.out.println(emp4.eid4);
        System.out.println(emp4.ename4);
    }
}


