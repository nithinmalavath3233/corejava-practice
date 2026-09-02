package com.oops;

import java.util.Scanner;

public class Main_shopCartItem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items you want to add in cart:");
        int i = sc.nextInt();

        System.out.println("Enter the price of 1 item:");
        int r = sc.nextInt();

        ShoppingCart i1 = new ShoppingCart();

        i1.addItem(i, r);

        System.out.println("After adding items:");
        System.out.println("Cart Items: " + i1.getCartItems());
        System.out.println("Total Amount: " + i1.getTotal());

        i1.removeItem(i, r);

        System.out.println("After removing items:");
        System.out.println("Cart Items: " + i1.getCartItems());
        System.out.println("Total Amount: " + i1.getTotal());
    }
}