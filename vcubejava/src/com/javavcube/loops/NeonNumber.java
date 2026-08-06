package com.javavcube.loops;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        for (int temp = square; temp > 0; temp = temp / 10) {
            int digit = temp % 10;
            sum += digit;
        }

        if (sum == n) {
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is not a Neon Number");
        }

        sc.close();
    }
}
