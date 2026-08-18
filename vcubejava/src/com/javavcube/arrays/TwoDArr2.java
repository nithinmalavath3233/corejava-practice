package com.javavcube.arrays;

public class TwoDArr2 {

    public static void main(String[] args) {

        int[][] arr = {
            {20, 3, 4, 35},
            {40, 34, 5, 4, 5, 6},
            {30, 4, 50},
            {90, 48, 23, 42}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}