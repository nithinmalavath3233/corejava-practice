package com.javavcube.loops;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        int n = sc.nextInt();

        int square = n * n;

        int temp = n;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int divisor = 1;

        for (int i = 1; i <= count; i++) {
            divisor = divisor * 10;
        }

        if (square % divisor == n) {
            System.out.println("The given number is an Automorphic Number");
        } else {
            System.out.println("The given number is not an Automorphic Number");
        }
    }
}
