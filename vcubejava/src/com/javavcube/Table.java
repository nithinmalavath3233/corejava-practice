package com.javavcube;

import java.util.Scanner;

public class Table {

    static void multiplication(int n, int n1) {
        for (int i = 1; i <= n1; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter how many times you want: ");
        int n1 = sc.nextInt();

        multiplication(n, n1);  
     

        sc.close();
    }
}
