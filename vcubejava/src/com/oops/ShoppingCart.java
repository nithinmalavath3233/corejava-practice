package com.oops;

public class ShoppingCart {
	private int cartitems;
	private int totalAmount;
	
	public void setCartitems(int cartitems) {
		this.cartitems=cartitems;
	}
	public int   getCartitems() {
		return cartitems;
		
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount=totalAmount;
	}
	public int   getTotalAmount() {
		return totalAmount;
		
	}
	public void additem(int item,int price) {
		
		cartitems=cartitems+item;
		int p=item*price;
		 totalAmount=totalAmount+p;
	}
public void removeitem(int items,int prices){
		
    
		int p=items*prices;
		if(p<=totalAmount && items<=cartitems) {
			cartitems=cartitems-items;
			 totalAmount=totalAmount-p;
		}
}
		public void gettotal() {
			
			System.out.println("cartitems:"+cartitems);
			System.out.println("totalamount:"+totalAmount);
			
		}


}
