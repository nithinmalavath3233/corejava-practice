package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CharArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        char arr[] = new char[n];

        System.out.println("Enter " + n + " characters:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}