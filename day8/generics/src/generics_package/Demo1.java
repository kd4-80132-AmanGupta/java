package generics_package;

import java.util.Date;
import java.util.ArrayList;

public class Demo1 {
	public static void main(String args[]) {
		GenericBox<String> b1 = new GenericBox<String>();
		b1.set(new String("Hello"));
		String s1 = b1.get();
		System.out.println(s1);
	
		GenericBox<Date> b2 = new GenericBox<Date>();
		b2.set(new Date());
		Date d2 = b2.get();
		System.out.println(d2);
		
		GenericBox<Integer> b3 = new GenericBox<Integer>();
		b3.set(new Integer(11));
		Integer i3 = (Integer) b3.get();
		System.out.println(i3);
		
//		GenericBox<Double> b4 = new GenericBox<Double>();
//		b4.set(new Double(3.14));
//		String s4 = b4.get(); // compiler error
//		System.out.println(s4);
	
	}
			

}
