package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BooleanArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        boolean arr[] = new boolean[n];

        System.out.println("Enter " + n + " boolean elements (true/false):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextBoolean();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}