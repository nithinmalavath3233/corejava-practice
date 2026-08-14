package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        String arr[] = new String[n];

        System.out.println("Enter " + n + " String elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}