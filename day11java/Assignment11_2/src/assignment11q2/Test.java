package assignment11q2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
	public static void main(String args[]) {
		
	
	
//	2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added,
//	what will happen? Books are stored in which order?
	
	Set<Book> set = new LinkedHashSet<>();
	
	
	set.add(new Book("33",340.0,"shyam",3));
	set.add(new Book("222",430.0,"Ram",3));
	System.out.println(set.add(new Book("33",310.0,"sundar",3)));
	set.add(new Book("1111",840.0,"bhagat",3));
	set.add(new Book("4",740.0,"shyam",3));
	
	Iterator<Book> itr= set.iterator();
	while(itr.hasNext()) {
		Book b = itr.next();
		System.out.println(b);
		
	}
}
}


