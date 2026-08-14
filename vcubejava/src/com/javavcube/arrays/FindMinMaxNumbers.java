package com.javavcube.arrays;

public class FindMinMaxNumbers {

    public static void main(String[] args) {

        int arr[] = {2, 5, 3, 6, 7, 1, -4, 53, 43, 92,92, -2};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            else  if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}