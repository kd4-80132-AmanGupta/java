package assignment11q1;

import java.util.Objects;
import java.util.Scanner;

public class Book {
	
	//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
//	isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

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
	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Book) {
		 Book b	= (Book)obj;
		 if(this.isbn.equals(b.isbn))
			 return true;
		} 
		return false;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
}
