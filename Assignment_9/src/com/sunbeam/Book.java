package com.sunbeam;
import java.util.*;
public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	Scanner sc = new Scanner (System.in);
	public Book() {
		super();
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void accept()
	{
		System.out.println("Enter book ISBN = ");
		this.isbn = sc.next();
		System.out.println("Enter book Price = ");
		this.price = sc.nextDouble();
		System.out.println("Enter book Author Name = ");
		this.authorName = sc.next();
		System.out.println("Enter book Quantity = ");
		this.quantity = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Book b1 = (Book)obj;
		if(this.isbn.equals(b1.isbn))
		{
			return true;
		}
		return super.equals(obj);
	}
	
	
}
