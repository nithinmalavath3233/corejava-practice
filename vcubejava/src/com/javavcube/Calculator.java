package com.javavcube;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = sc.nextInt();

        System.out.println("Enter number b: ");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter operator (+, -, *, /): ");
        String operator = sc.nextLine();

        double calc = switch (operator) {

            case "+" -> {
                yield a + b;
            }

            case "-" -> {
                yield a - b;
            }

            case "*" -> {
                yield a * b;
            }

            case "/" -> {
                
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    yield 0;
                }
                yield (double) a / b; 
            }

            default -> {
                System.out.println("Invalid operator.");
                yield 0;
            }
        };

        System.out.println("Result = " + calc);

        sc.close();
    }
}
