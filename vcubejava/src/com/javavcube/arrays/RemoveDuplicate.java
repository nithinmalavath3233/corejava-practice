package com.javavcube.arrays;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5};

        int n = arr.length;

        // Remove duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    // Shift elements to the left
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    n--;
                    j--;
                }
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
