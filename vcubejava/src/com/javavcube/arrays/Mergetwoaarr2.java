package com.javavcube.arrays;

import java.util.Arrays;

public class Mergetwoaarr2 {

    public static void main(String[] args) {

        int a1[] = {1, 4, 10, 7, -5, -3, 6, -2, 0, 1, 5, 0, 0};

        int post = 0;
        int negi = 0;
        int zeros = 0;

        // Count positive, negative and zero elements
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > 0) {
                post++;
            } else if (a1[i] < 0) {
                negi++;
            } else {
                zeros++;
            }
        }

        int pos[] = new int[post];
        int neg[] = new int[negi];
        int zero[] = new int[zeros];

        int p = 0;
        int n = 0;
        int z = 0;

        // Store elements in respective arrays
        for (int i = 0; i < a1.length; i++) {

            if (a1[i] > 0) {
                pos[p] = a1[i];
                p++;
            } else if (a1[i] < 0) {
                neg[n] = a1[i];
                n++;
            } else {
                zero[z] = a1[i];
                z++;
            }
        }
        System.out.println("Positive : " + Arrays.toString(pos)+" lenght of pos array: "+pos.length);
        System.out.println("Negative : " + Arrays.toString(neg)+" lenght of neg array: "+neg.length);
        System.out.println("Zero     : " + Arrays.toString(zero)+" lenght of zeros array : "+zero.length);
    }
}