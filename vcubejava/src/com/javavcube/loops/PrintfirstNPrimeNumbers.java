package com.javavcube.loops;

import java.util.Scanner;

public class PrintfirstNPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;
        int i = 2;

        while (count<n) {

            if (isPrime(i)) {
                 count++;                
                System.out.print(i + "  ");
            }
            i++;
            
        }

        sc.close();
    }

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i*i<= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}