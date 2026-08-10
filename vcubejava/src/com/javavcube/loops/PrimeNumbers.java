
package com.javavcube.loops;

import java.util.Scanner;

public class PrimeNumbers {

     void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+"  ");
            }
        }

        sc.close();
    }


     boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

