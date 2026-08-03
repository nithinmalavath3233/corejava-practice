package com.javavcube;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks percentage: ");
        int marks = sc.nextInt();

        String grade = switch (marks / 10) {
            case 10, 9 -> "A+";

            case 8 -> {
                System.out.println("Good job!");
                yield "A";
            }

            case 7 -> {
                System.out.println("Well done!");
                yield "B";
            }

            case 6 -> {
                System.out.println("Nice effort!");
                yield "C";
            }

            default -> {
                System.out.println("Needs improvement.");
                yield "Fail";
            }
        };

        System.out.println("Grade: " + grade);

        sc.close();
    }
}

