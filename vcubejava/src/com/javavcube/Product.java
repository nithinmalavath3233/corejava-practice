package com.javavcube;

public class Product {
	int productid;
	String productname;
	int price;
	 Product(int id, String Name,int rate){
		 productid=id;
		 productname=Name;
		 price=rate;
		/* System.out.println("product details");
		 System.out.println("product id:"+productid);
		 System.out.println("productname:"+productname);
		 System.out.println("product price:"+ price);
		 System.out.println("-----------------------------------------------------------------");*/
	 }
	 void dispaly() {
		 System.out.println("product details");
		 System.out.println("product id:"+productid);
		 System.out.println("productname:"+productname);
		 System.out.println("product price:"+ price);
		 System.out.println("-----------------------------------------------------------------");
		 
	 }

	public static void main(String[] args) {
		System.out.println("main method started");
		Product p1= new Product(1,"mobile",15000);
	        p1.dispaly();
		Product p2= new Product(2,"laptop",25000);
		   p2.dispaly();
		Product p3= new Product(3,"bag",800);
		  p3.dispaly();


	}

}
