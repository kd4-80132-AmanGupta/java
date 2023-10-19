package assignment11q3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Test1 {
	public static void main(String args[]) {
		
//Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
//		Books are stored in which order?
	
   Set<Book> set = new TreeSet<>();
	
	
	set.add(new Book("12",340.0,"shyam",3));
	System.out.println(set.add(new Book("1",430.0,"Ram",3)));
	System.out.println(set.add(new Book("9",310.0,"sundar",3)));
	set.add(new Book("8",840.0,"bhagat",3));
	set.add(new Book("4",740.0,"shyam",3));
	
	Iterator<Book> itr= set.iterator();
	while(itr.hasNext()) {
		Book b = itr.next();
		System.out.println(b);
		
	}
	

}
}
