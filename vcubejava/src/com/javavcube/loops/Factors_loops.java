package com.javavcube.loops;

import java.util.Scanner;

public class Factors_loops {

    static boolean findfactors(int n) {
        int sum = 0;
           boolean flag=false;
        for (int i = 1; i <= n / 2; i++) {   
            if (n % i == 0) {
                sum += i;
                
            }
            if(sum==n) flag=true;
            	
            
        }

      // return sum == n;
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isStatus = findfactors(n);

        if (isStatus) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

        sc.close();
    }
}
