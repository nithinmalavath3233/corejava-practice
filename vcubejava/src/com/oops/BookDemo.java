package com.oops;

public class BookDemo {
	 public static void main(String[] args) {

	        Book b = new Book();

	        // Setting values using setters
	        b.setBookId(101);
	        b.setTitle("Java Programming");
	        b.setAuthor("James Gosling");
	        b.setPrice(599.50);

	        // Displaying values using getters
	        System.out.println("Book ID : " + b.getBookId());
	        System.out.println("Title   : " + b.getTitle());
	        System.out.println("Author  : " + b.getAuthor());
	        System.out.println("Price   : " + b.getPrice());
	    }
}
