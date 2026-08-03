package com.javavcube;
import java.util.Scanner;

public class Recharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Mobile Recharge =====");
        System.out.println("1. ₹199 Plan");
        System.out.println("2. ₹299 Plan");
        System.out.println("3. ₹399 Plan");
        System.out.println("4. ₹599 Plan");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("₹199 Plan Activated");
                break;

            case 2:
                System.out.println("₹299 Plan Activated");
                break;

            case 3:
                System.out.println("₹399 Plan Activated");
                break;

            case 4:
                System.out.println("₹599 Plan Activated");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
