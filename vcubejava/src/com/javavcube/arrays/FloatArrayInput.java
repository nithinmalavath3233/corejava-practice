package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FloatArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        float arr[] = new float[n];

        System.out.println("Enter " + n + " float elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}