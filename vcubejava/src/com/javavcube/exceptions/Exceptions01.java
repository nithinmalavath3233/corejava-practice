
package com.javavcube.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions01 {

    public static void main(String[] args) {
        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

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

        System.out.println("main method ended");
        System.out.println("main method ended");
        System.out.println("main method ended");
        System.out.println("main method ended");

        sc.close();
    }
}
