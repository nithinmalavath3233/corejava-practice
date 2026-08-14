package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        double arr[] = new double[n];

        System.out.println("Enter " + n + " double elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
