package com.javavcube;

import java.util.Scanner;

public class MovieTicket {

    void display() {
        System.out.println("Select ticket type:");
        System.out.println("1. Silver - Rs.200");
        System.out.println("2. Gold - Rs.300");
        System.out.println("3. Platinum - Rs.400");
        System.out.println("4. Exit");
    }

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int type;   // ✅ Declare here

        do {

            display();

            System.out.print("Enter your choice: ");
            type = sc.nextInt();   // ✅ Assign here

           // if (type == 4) {
          //      System.out.println("Exit");
           //  /   break;
          //  }
             
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
             
            

            int silver = 200;
            int gold = 300;
            int platinum = 400;

            switch (type) {

                case 1 -> {
                    System.out.println("Silver");
                    System.out.print("Enter your age: ");
                  //  int age = sc.nextInt();
                     

                    if (age >= 60) {
                        System.out.println("Senior Citizen");
                        double p = silver - (silver * 10 / 100.0);
                        System.out.println("Silver Ticket Price: " + p);
                    } else {
                        System.out.println("Silver Ticket Price: " + silver);
                    }
                }

                case 2 -> {
                    System.out.println("Gold");

                    double price = gold;

                    if (age >= 60) {
                        System.out.println("Senior Citizen");
                        price = price - (price * 10 / 100);
                    }

                    System.out.println("Gold Ticket Price: " + price);
                }

                case 3 -> {
                    System.out.println("Platinum");

                    double price = platinum;

                    if (age >= 60) {
                        System.out.println("Senior Citizen");
                        price = price - (price * 10 / 100);
                    }

                    System.out.println("Platinum Ticket Price: " + price);
                }
                case 4->{
                	System.out.println("exit");
                	System.out.println("Thank u visit again");
                }
                

                default -> System.out.println("Invalid Choice");
            }

        } while (type != 4);

        sc.close();
    }
}
