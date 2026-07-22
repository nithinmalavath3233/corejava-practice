package com.javavcube;

public class Wrapper { 
	Integer Product_Id=102;
	String product_name="mobile";
	Integer product_rating=5;
	boolean product_status=true;
	boolean stock_avail=true;
	Integer Discount=50;
	Integer product_code=1020;
	
	

	public static void main(String[] args) {
		Wrapper t=new Wrapper();
		System.out.println("product_id:"+t.Product_Id);
		System.out.println("product_name:"+t.product_name);
		System.out.println("product_raring"+t.product_rating);
		System.out.println("product_status:"+t.product_status);
		System.out.println("stock available"+ t.stock_avail);
		System.out.println("Discount"+t.Discount);
		System.out.println("product_code"+t.product_code);
		
		

	}

}
