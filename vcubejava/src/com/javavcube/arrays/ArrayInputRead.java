package com.javavcube.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputRead {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        //using for each loop printing array elements
        for(int num:arr) {
        	System.out.print(num+ " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}