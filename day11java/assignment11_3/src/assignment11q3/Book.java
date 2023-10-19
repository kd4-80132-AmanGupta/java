package assignment11q3;

import java.util.Objects;
import java.util.Scanner;


public class Book implements Comparable<Book> {

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {	
	}

	public Book(String isbn, double price, String authorName, int quantity) {
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
	
	public void acceptBookDetails(Scanner sc) {
		System.out.println("Enter Book Details to add");
		
		System.out.println("enter isbn");
		this.isbn = sc.next();
		
		System.out.println("enter price");
		this.price = sc.nextDouble();
		
		System.out.println("enter author name");
		this.authorName = sc.next();
		
		System.out.println("enter quantity");
		this.quantity = sc.nextInt();
			
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	public int compareTo(Book obj) {
		int diff = this.getIsbn().compareTo(obj.getIsbn());
		return diff;
		
	}
	
	
	
}


