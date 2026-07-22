package com.javavcube;

public class Mobiles {
	String mobilename;
	String model;
	int price;
	String colour;
	Mobiles(){
		
	}

	public Mobiles(String mobilename, String model) {
	
		this.mobilename = mobilename;
		this.model = model;
		
	}

	public Mobiles(String mobilename) {
		super();
		this.mobilename = mobilename;
	}

	public Mobiles(String mobilename, int price, String colour) {
		super();
		this.mobilename = mobilename;
		this.price = price;
		this.colour = colour;
	}

	public Mobiles(String mobilename, String model, int price, String colour) {
		super();
		this.mobilename = mobilename;
		this.model = model;
		this.price = price;
		this.colour = colour;
	}

	public Mobiles(String mobilename, String model, int price) {
		super();
		this.mobilename = mobilename;
		this.model = model;
		this.price = price;
	}
	public Mobiles(int price, String mobilename) {
		super();
		this.mobilename = mobilename;
		this.price = price;
	}
	public Mobiles(String mobilename,int price) {
		
		this.mobilename = mobilename;
		this.price = price;
	}
	public static void main(String[] args) {
		Mobiles m1=new Mobiles(15000,"motorola");
	        m1.show();
	}
	
	public Mobiles(int price) {
		
		this.price = price;
	}

	void show() {
		System.out.println("Mobile name:"+ mobilename);
		System.out.println("Model name:"+ model);
		System.out.println("Mobile price:"+ price);
		System.out.println("Mobile colour :"+ colour);
		
		
	}

}
