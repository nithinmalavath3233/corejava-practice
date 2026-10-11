
package com.javavcube.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception07 {

    public static void main(String[] args) {

        System.out.println("main method started");
        System.out.println(hello());

        Scanner sc = new Scanner(System.in);

        // Example 1: ArithmeticException and InputMismatchException

        /*
        try {
            System.out.println("enter a number");
            int n1 = sc.nextInt();

            System.out.println("enter a number");
            int n2 = sc.nextInt();

            System.out.println("in try!!");
            System.out.println(n1 / n2);
        }
        catch (ArithmeticException e) {
            System.out.println("in catch!!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("in inputmismatch!!");
            e.printStackTrace();
        }
        */

        // Example 2: Finally block

        /*
        int x = 100 / 2;
        String s = "nithin";
        String s1 = null;

        try {
            System.out.println("in try 1");
            // System.out.println(s.charAt(x));
        }
        finally {
            System.out.println("in finally-1");
        }

        try {
            System.out.println("in try 2");
            System.out.println(s1.length());
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("in catch-1");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("in catch");
            e.printStackTrace();
        }
        */

        // Example 3: ArrayIndexOutOfBoundsException

        // FIX 1:
        // Declare the array outside the try block.
        // Otherwise, arr cannot be accessed outside the try block.
//        int arr[] = new int[5];
//
//        try {
//            System.out.println("in try");
//
//            arr[0] = 10;
//            arr[1] = 20;
//            arr[3] = 30;
//            arr[4] = 40;
//
//            // ERROR:
//            // Array size is 5, so valid indexes are 0 to 4.
//            // arr[5] = 50; // Causes ArrayIndexOutOfBoundsException
//
//            // FIX 2:
//            // Use arr[2] to store 50 instead.
//            arr[2] = 50;
//
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("in catch");
//            e.printStackTrace();
//        }
//        catch (Exception e) {
//            System.out.println("in general catch");
//            e.printStackTrace();
//        }
//
//        // Print all array elements
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("main method ended");
//        System.out.println("main method ended");
//        System.out.println("main method ended");
//        System.out.println("main method ended");
//
//        sc.close();
          
        
        
         
        
        
    }
    static   int hello() {
  	  
  	  try {
  		  return 10;
  	  }
  	 catch(Exception e) {
  		 return 20;
  	 }
  	  finally {
  		  return 30;
  	  }
    }
   
  
  
}