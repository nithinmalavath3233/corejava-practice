package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ByteArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        byte arr[] = new byte[n];

        System.out.println("Enter " + n + " byte elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextByte();
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
