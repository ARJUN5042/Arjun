package com.librarymanagementsystem;

public class Book 
{
	private int bookId;
    private String bookName;
    private String author;
    private int quantity;
    private double price;
    private String category;

    public Book(int bookId, String bookName, String author, int quantity, double price, String category) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

	public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    
    public void setBookId(int bookId) {
    	this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setCaregory(String category) {
    	this.category = category;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId +
                "\nBook Name: " + bookName +
                "\nAuthor: " + author +
                "\nQuantity: " + quantity +
                "\nPrice: " + price +
                "\nCategory: " + category +
                "\n---------------------------";
    }
}
