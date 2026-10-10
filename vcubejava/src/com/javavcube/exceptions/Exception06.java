
package com.javavcube.exceptions;

public class Exception06 {

    public static void main(String[] args) {

        try {
            String str = "one";
            int x = Integer.parseInt(str);
            System.out.println(x);
        }
        catch (Exception e) {
            System.out.println("in catch");
        }

        System.out.println("main method ended");
    }
}
