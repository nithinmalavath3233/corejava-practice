package com.javavcube;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Restaurant {

    public static void main(String[] args) {

        System.out.println("========================= Welcome To Thindham  Raa Restaurant =========================");

        Scanner sc = new Scanner(System.in);

        int quantity;
        int invoiceNo = 1001;
        int orderNo = 5001;
        String tiffinItem = "";
       // int tiffinQty = 0;
        double tiffinPrice = 0;

        String vegItem = "";
        //int vegQty = 0;
        double vegPrice = 0;

        String nonvegItem = "";
        //int nonvegQty = 0;
        double nonvegPrice = 0;

        String dessertItem = "";
     //   int dessertQty = 0;
        double dessertPrice = 0;

        String drinkItem = "";
        //int drinkQty = 0;
        double drinkPrice = 0;

        double price;
        double grandTotal = 0;   
        int option;             
        do {

            System.out.println("=============== MAIN MENU ===============");
            System.out.println("1. Tiffins");
            System.out.println("2. Veg");
            System.out.println("3. Non Veg");
            System.out.println("4. Desserts");
            System.out.println("5. Drinks");
            System.out.println("6. Exit");
            System.out.println("=========================================");
            System.out.print("Select Category: ");
           // System.out.println("=========================================");
            int category = sc.nextInt();

            switch (category) {
	    case 1->{
	    	System.out.println("===== TIFFINS MENU =====");
	    	System.out.println("1. Idli - ₹40");
	    	System.out.println("2. Dosa - ₹60");
	    	System.out.println("3. Masala Dosa - ₹80");
	    	System.out.println("4. Poori - ₹70");
	    	System.out.println("5. Upma - ₹50");
	    	System.out.println("6. Vada - ₹40");
	    	System.out.println("7. Pongal - ₹70");
	    	System.out.println("8. Uttapam - ₹90");
	    	System.out.println("9. Bonda - ₹50");
	    	System.out.println("10. Punugulu - ₹60");
	    	System.out.println("11. Pulihora - ₹70");
	    	System.out.println("12. Chapathi - ₹80");

	    	String tiffinItems = "";
	    	//double tiffinPrice = 0;
	    	int choice;

	    	do {

	    	    System.out.print("Choose Tiffin: ");
	    	    int tiffin = sc.nextInt();

	    	    switch (tiffin) {

	    	        case 1 -> {
	    	            System.out.println("You selected Idli");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 40 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Idli\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 2 -> {
	    	            System.out.println("You selected Dosa");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 60 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Dosa\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 3 -> {
	    	            System.out.println("You selected Masala Dosa");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 80 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Masala Dosa\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 4 -> {
	    	            System.out.println("You selected Poori");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 70 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Poori\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 5 -> {
	    	            System.out.println("You selected Upma");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 50 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Upma\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 6 -> {
	    	            System.out.println("You selected Vada");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 40 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Vada\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 7 -> {
	    	            System.out.println("You selected Pongal");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 70 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Pongal\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 8 -> {
	    	            System.out.println("You selected Uttapam");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 90 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Uttapam\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 9 -> {
	    	            System.out.println("You selected Bonda");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 50 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Bonda\t\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 10 -> {
	    	            System.out.println("You selected Punugulu");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 60 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Punugulu\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 11 -> {
	    	            System.out.println("You selected Pulihora");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 70 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Pulihora\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        case 12 -> {
	    	            System.out.println("You selected Chapathi");
	    	            System.out.print("Enter quantity: ");
	    	            quantity = sc.nextInt();

	    	            double bill = 80 * quantity;
	    	            tiffinPrice += bill;

	    	            tiffinItem += "Chapathi\t" + quantity + "\t₹" + bill + "\n";
	    	        }

	    	        default -> System.out.println("Invalid Tiffin Choice");
	    	    }

	    	    System.out.println("Do you want to order another Tiffin?");
	    	    System.out.println("1. Yes");
	    	    System.out.println("2. No");
	    	    choice = sc.nextInt();

	    	} while (choice == 1);

	    	System.out.println("\n========== TIFFINS BILL ==========");
	    	System.out.println("Item\t\tQty\tAmount");
	    	System.out.print(tiffinItem);
	    	System.out.println("----------------------------------");
	    	System.out.println("Total Tiffins Bill : ₹" + tiffinPrice);

	    	grandTotal += tiffinPrice;
	    }

        case 2 -> {

            System.out.println("===== VEG MENU =====");
            System.out.println("1. Paneer Biryani - ₹220");
            System.out.println("2. Veg Fried Rice - ₹180");
            System.out.println("3. Veg Noodles - ₹170");
            System.out.println("4. Mushroom Curry - ₹200");
            System.out.println("5. Dal Tadka - ₹160");

          int choice;

            do {

                System.out.print("Choose Veg Item: ");
                int veg = sc.nextInt();

                switch (veg) {

                    case 1 -> {
                        System.out.println("You selected Paneer Biryani");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 220 * quantity;
                        vegPrice += bill;

                        vegItem += "Paneer Biryani\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 2 -> {
                        System.out.println("You selected Veg Fried Rice");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 180 * quantity;
                        vegPrice += bill;

                        vegItem += "Veg Fried Rice\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 3 -> {
                        System.out.println("You selected Veg Noodles");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 170 * quantity;
                        vegPrice += bill;

                        vegItem += "Veg Noodles\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 4 -> {
                        System.out.println("You selected Mushroom Curry");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 200 * quantity;
                        vegPrice += bill;

                        vegItem += "Mushroom Curry\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 5 -> {
                        System.out.println("You selected Dal Tadka");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 160 * quantity;
                        vegPrice += bill;

                        vegItem += "Dal Tadka\t" + quantity + "\t₹" + bill + "\n";
                    }

                    default -> System.out.println("Invalid Veg Choice");
                }

                System.out.println("Do you want to order another Veg Item?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("\n========== VEG BILL ==========");
            System.out.println("Item\t\t\tQty\tAmount");
            System.out.print(vegItem);
            System.out.println("--------------------------------");
            System.out.println("Total Veg Bill : ₹" + vegPrice);

            grandTotal += vegPrice;
        }  
	   
        case 3 -> {

            System.out.println("===== NON-VEG MENU =====");
            System.out.println("1. Chicken Biryani - ₹280");
            System.out.println("2. Mutton Biryani - ₹350");
            System.out.println("3. Fish Curry - ₹300");
            System.out.println("4. Chicken Curry - ₹260");
            System.out.println("5. Prawns Fry - ₹380");

            int choice;

            do {

                System.out.print("Choose Non-Veg Item: ");
                int nonveg = sc.nextInt();

                switch (nonveg) {

                    case 1 -> {
                        System.out.println("You selected Chicken Biryani");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 280 * quantity;
                        nonvegPrice += bill;

                        nonvegItem += "Chicken Biryani\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 2 -> {
                        System.out.println("You selected Mutton Biryani");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 350 * quantity;
                        nonvegPrice += bill;

                        nonvegItem += "Mutton Biryani\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 3 -> {
                        System.out.println("You selected Fish Curry");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 300 * quantity;
                        nonvegPrice += bill;

                        nonvegItem += "Fish Curry\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 4 -> {
                        System.out.println("You selected Chicken Curry");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 260 * quantity;
                        nonvegPrice += bill;

                        nonvegItem += "Chicken Curry\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 5 -> {
                        System.out.println("You selected Prawns Fry");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 380 * quantity;
                        nonvegPrice += bill;

                        nonvegItem += "Prawns Fry\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    default -> System.out.println("Invalid Non-Veg Choice");
                }

                System.out.println("Do you want to order another Non-Veg Item?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("\n========== NON-VEG BILL ==========");
            System.out.println("Item\t\t\tQty\tAmount");
            System.out.print(nonvegItem);
            System.out.println("----------------------------------");
            System.out.println("Total Non-Veg Bill : ₹" + nonvegPrice);

            grandTotal += nonvegPrice;
        }

	    	    	      
	   
        case 4 -> {

            System.out.println("===== DESSERTS MENU =====");
            System.out.println("1. Ice Cream - ₹80");
            System.out.println("2. Gulab Jamun - ₹70");
            System.out.println("3. Brownie - ₹120");
            System.out.println("4. Fruit Salad - ₹90");
            System.out.println("5. Rasmalai - ₹100");

            int choice;

            do {

                System.out.print("Choose Dessert: ");
                int dessert = sc.nextInt();

                switch (dessert) {

                    case 1 -> {
                        System.out.println("You selected Ice Cream");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 80 * quantity;
                        dessertPrice += bill;

                        dessertItem += "Ice Cream\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 2 -> {
                        System.out.println("You selected Gulab Jamun");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 70 * quantity;
                        dessertPrice += bill;

                        dessertItem += "Gulab Jamun\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 3 -> {
                        System.out.println("You selected Brownie");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 120 * quantity;
                        dessertPrice += bill;

                        dessertItem += "Brownie\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 4 -> {
                        System.out.println("You selected Fruit Salad");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 90 * quantity;
                        dessertPrice += bill;

                        dessertItem += "Fruit Salad\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 5 -> {
                        System.out.println("You selected Rasmalai");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 100 * quantity;
                        dessertPrice += bill;

                        dessertItem += "Rasmalai\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    default -> System.out.println("Invalid Dessert Choice");
                }

                System.out.println("Do you want to order another Dessert?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("\n========== DESSERTS BILL ==========");
            System.out.println("Item\t\t\tQty\tAmount");
            System.out.print(dessertItem);
            System.out.println("-----------------------------------");
            System.out.println("Total Desserts Bill : ₹" + dessertPrice);

            grandTotal += dessertPrice;
        }
        case 5 -> {

            System.out.println("===== DRINKS MENU =====");
            System.out.println("1. Coca-Cola - ₹40");
            System.out.println("2. Pepsi - ₹40");
            System.out.println("3. Sprite - ₹40");
            System.out.println("4. Mango Juice - ₹60");
            System.out.println("5. Mineral Water - ₹20");

            int choice;

            do {

                System.out.print("Choose Drink: ");
                int drink = sc.nextInt();

                switch (drink) {

                    case 1 -> {
                        System.out.println("You selected Coca-Cola");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 40 * quantity;
                        drinkPrice += bill;

                        drinkItem += "Coca-Cola\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 2 -> {
                        System.out.println("You selected Pepsi");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 40 * quantity;
                        drinkPrice += bill;

                        drinkItem += "Pepsi\t\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 3 -> {
                        System.out.println("You selected Sprite");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 40 * quantity;
                        drinkPrice += bill;

                        drinkItem += "Sprite\t\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 4 -> {
                        System.out.println("You selected Mango Juice");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 60 * quantity;
                        drinkPrice += bill;

                        drinkItem += "Mango Juice\t\t" + quantity + "\t₹" + bill + "\n";
                    }

                    case 5 -> {
                        System.out.println("You selected Mineral Water");
                        System.out.print("Enter quantity: ");
                        quantity = sc.nextInt();

                        double bill = 20 * quantity;
                        drinkPrice += bill;

                        drinkItem += "Mineral Water\t" + quantity + "\t₹" + bill + "\n";
                    }

                    default -> System.out.println("Invalid Drink Choice");
                }

                System.out.println("Do you want to order another Drink?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("\n========== DRINKS BILL ==========");
            System.out.println("Item\t\t\tQty\tAmount");
            System.out.print(drinkItem);
            System.out.println("----------------------------------");
            System.out.println("Total Drinks Bill : ₹" + drinkPrice);

            grandTotal += drinkPrice;
        }
	  
	    case 6 -> {
	        System.out.println("Thank You! Visit Again.");
	    }

	    default -> {
	        System.out.println("Invalid Option");
	        System.out.println("Please select between 1 and 6.");
	        
	    }

	    }   // <-- switch(category) ends here

	    System.out.println();
	    System.out.println("Do you want to order from another category?");
	    System.out.println("1. Yes");
	    System.out.println("2. No");
	    option = sc.nextInt();   // Don't write 'int' here

    }while (option == 1);

 // Bill Calculation
 double subTotal = tiffinPrice + vegPrice + nonvegPrice + dessertPrice + drinkPrice;

 System.out.println();
 System.out.println("Do you have a Coupon?");
 System.out.println("1. Yes");
 System.out.println("2. No");
 int coupon = sc.nextInt();

 double discount = 0;

 if (coupon == 1) {
     discount = subTotal * 0.10;
     System.out.println("10% Discount Applied Successfully.");
 } else {
     System.out.println("No Coupon Applied.");
 }

 double amountAfterDiscount = subTotal - discount;
 double gst = amountAfterDiscount * 0.05;
 grandTotal = amountAfterDiscount + gst;

 // Payment Mode
 System.out.println();
 System.out.println("Select Payment Method");
 System.out.println("1. Cash");
 System.out.println("2. UPI");
 System.out.println("3. Card");
 int payment = sc.nextInt();

 String paymentMode = "";

 switch (payment) {
 case 1 -> paymentMode = "Cash";
 case 2 -> paymentMode = "UPI";
 case 3 -> paymentMode = "Card";
 default -> paymentMode = "Unknown";
 }

 // Date & Time
 LocalDate date = LocalDate.now();
 LocalTime time = LocalTime.now();

 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
 DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

 // Final Bill
 System.out.println();
 System.out.println("********************* FINAL BILL *****************************");
 System.out.println("==============================================================");
 System.out.println("               THINDHAM RAA RESTAURANT");
 System.out.println("==============================================================");
 System.out.println("Invoice No      : " + invoiceNo);
 System.out.println("Order No        : ORD" + orderNo);
 System.out.println("Date            : " + date.format(dateFormat));
 System.out.println("Time            : " + time.format(timeFormat));
 System.out.println("Coupon Applied  : " + (coupon == 1 ? "YES" : "NO"));
 System.out.println("Payment Mode    : " + paymentMode);
 System.out.println("Payment Status  : SUCCESS");
 System.out.println("==============================================================");

 if (!tiffinItem.isEmpty()) {
     System.out.println("\n--------------- TIFFINS ----------------");
     System.out.println("Item\t\tQty\tAmount");
     System.out.print(tiffinItem);
     System.out.printf("Total Tiffins Bill : ₹%.2f%n", tiffinPrice);
 }

 if (!vegItem.isEmpty()) {
     System.out.println("\n----------------- VEG ------------------");
     System.out.println("Item\t\t\tQty\tAmount");
     System.out.print(vegItem);
     System.out.printf("Total Veg Bill : ₹%.2f%n", vegPrice);
 }

 if (!nonvegItem.isEmpty()) {
     System.out.println("\n-------------- NON-VEG -----------------");
     System.out.println("Item\t\t\tQty\tAmount");
     System.out.print(nonvegItem);
     System.out.printf("Total Non-Veg Bill : ₹%.2f%n", nonvegPrice);
 }

 if (!dessertItem.isEmpty()) {
     System.out.println("\n-------------- DESSERTS ----------------");
     System.out.println("Item\t\t\tQty\tAmount");
     System.out.print(dessertItem);
     System.out.printf("Total Desserts Bill : ₹%.2f%n", dessertPrice);
 }

 if (!drinkItem.isEmpty()) {
     System.out.println("\n--------------- DRINKS -----------------");
     System.out.println("Item\t\t\tQty\tAmount");
     System.out.print(drinkItem);
     System.out.printf("Total Drinks Bill : ₹%.2f%n", drinkPrice);
 }

 System.out.println();
 System.out.println("==============================================================");
 System.out.println("                    BILL SUMMARY");
 System.out.println("==============================================================");
 System.out.printf("Subtotal              : ₹%.2f%n", subTotal);
 System.out.printf("Discount (10%%)        : ₹%.2f%n", discount);
 System.out.printf("GST (5%%)              : ₹%.2f%n", gst);
 System.out.println("--------------------------------------------------------------");
 System.out.printf("Grand Total           : ₹%.2f%n", grandTotal);
 //System.out.println("==============================================================");
 System.out.println("==============================================================");
 System.out.println("Restaurant Address : Secundrabad, Hyderbad,Telangana");
 System.out.println("Contact Number     : +91 9876543210");
 System.out.println("GST No             : 36ABCDE1234F1Z5");
 System.out.println("Email              : support@thindhamraa.com");
 System.out.println("Website            : www.thindhamraa.com");
 //System.out.println("==============================================================");
 System.out.println("==============================================================");
 System.out.println("             THANK YOU FOR VISITING");
 System.out.println("          THINDHAM RAA RESTAURANT");
 System.out.println();
 System.out.println("        ⭐⭐⭐⭐⭐ RATE OUR SERVICE ⭐⭐⭐⭐⭐");
 System.out.println("        We Hope To Serve You Again!");
 System.out.println("             Visit Again 😊");
 System.out.println("==============================================================");

 sc.close();
 }
 }