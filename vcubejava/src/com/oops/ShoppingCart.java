package com.oops;

public class ShoppingCart {

    private int cartItems;
    private int totalAmount;

    public void setCartItems(int cartItems) {
        this.cartItems = cartItems;
    }

    public int getCartItems() {
        return cartItems;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void addItem(int item, int price) {
        cartItems = cartItems + item;
        totalAmount = totalAmount + (item * price);
    }

    public void removeItem(int item, int price) {
        int amount = item * price;

        if (item <= cartItems && amount <= totalAmount) {
            cartItems = cartItems - item;
            totalAmount = totalAmount - amount;
        }
    }

    public int getTotal() {
        return totalAmount;
    }
}
