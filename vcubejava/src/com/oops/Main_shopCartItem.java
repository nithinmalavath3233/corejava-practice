package com.oops;
import java.util.Scanner;

public class Main_shopCartItem {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of items you want add in cart:");
		int i=sc.nextInt();
		System.out.println("enter the price of 1 item:");
		int r=sc.nextInt();
			
		
     ShoppingCart i1 =new ShoppingCart();
     
     i1.setCartitems(1);
     i1.setTotalAmount(1000);
      i1.additem(i,r);
      i1.removeitem(i,r);
      i1.gettotal();
     
     System.out.println("Cartitems:"+ i1.getCartitems());
     System.out.println("Toalitems:"+i1.getTotalAmount());
     
    
     
     
     
	}

}
