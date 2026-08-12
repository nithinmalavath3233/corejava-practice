package com.javavcube.loops;

import java.util.Scanner;

public class ArmstronfNumberUptoN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            int digitcount = Integer.toString(i).length();

            if(isArmstrong(i, digitcount)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrong(int n, int digitcount) {

        int temp = n;
        int sum = 0;

        while(n > 0) {
            int r = n % 10;
            n = n / 10;

            
            sum = sum + (int)Math.pow(r, digitcount);
        }

        return sum == temp;
    }
}

