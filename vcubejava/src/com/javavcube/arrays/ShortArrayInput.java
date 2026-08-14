package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        short arr[] = new short[n];

        System.out.println("Enter " + n + " short elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextShort();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}