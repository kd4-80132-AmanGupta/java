package assignment11q6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student s;
		int choice;
		
		Map<Integer,Student> studMap = new LinkedHashMap<>();
		
		
		do {
			System.out.println("1. Add student");
			System.out.println("2. find student");
			System.out.print("enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : s = new Student();
			         s.accept(sc);
			         studMap.put(s.getRollno(),s);
				
				break;
				
			case 2 : System.out.print("enter rollno to find student: ");
				     int rollno = sc.nextInt();
				     Student stud = studMap.get(rollno);
				     if(stud!=null)
			         System.out.println(stud); 
				     else
				    	 System.out.println("Student not found !!");
				break;
				
				default : System.out.println("invalid choice : ");
			}
					
		}while(choice!=0);
		
	}

}
