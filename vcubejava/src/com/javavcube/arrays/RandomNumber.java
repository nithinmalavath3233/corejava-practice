package com.javavcube.arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        Random r1 = new Random();
        int r = r1.nextInt(10) + 1; // 1 to 10

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 10:");

        for (int i = 1; i <= 3; i++) {

            int n = sc.nextInt();

            if (n == r) {
                System.out.println("You won!");
                break;
            }

            if (i < 3) {
                System.out.println("Try again");
            } else {
                System.out.println("Better luck next time!");
                System.out.println("The number was: " + r);
            }
        }

        sc.close();
    }
}
