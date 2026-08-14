package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        long arr[] = new long[n];

        System.out.println("Enter " + n + " long elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}