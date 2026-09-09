package com.oops;

package com.assignment;

interface FoodOrder {
    void prepareFood();
}

class OrderDetails {
    int orderId;
    String customerName;
    double price;

    OrderDetails(int orderId, String customerName, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Price: " + price);
    }
}

class PizzaOrder extends OrderDetails implements FoodOrder {

    PizzaOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing Pizza...");
    }
}

class BurgerOrder extends OrderDetails implements FoodOrder {

    BurgerOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing Burger...");
    }
}

public class Main {
    public static void main(String[] args) {

        FoodOrder order;

        order = new PizzaOrder(101, "Nithin", 250);
        order.prepareFood();

        PizzaOrder pizza = (PizzaOrder) order;
        pizza.displayDetails();

        System.out.println();

        order = new BurgerOrder(102, "Rahul", 180);
        order.prepareFood();

        BurgerOrder burger = (BurgerOrder) order;
        burger.displayDetails();
    }
}
