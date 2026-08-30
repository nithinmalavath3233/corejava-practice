package com.oops;

public class Book {
	// Private variables - Data Hiding
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Setter for bookId
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    // Getter for bookId
    public int getBookId() {
        return bookId;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
