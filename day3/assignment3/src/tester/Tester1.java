package tester;

import sunbeam.assignment3.Point2D;

public class Tester1 {
	public static void main(String args[]) {
		Point2D p = new Point2D();
		int choice;
		do {
//				int choice;
//				int a = noOfPoint;
				System.out.println("---------------------------------------------------------");
				System.out.println("Enter 0. to Exit");
				System.out.println("Enter 1. to accept the x,y coordinates:");
				System.out.println("Enter 2. to Display details of a specific point	");
				System.out.println("Enter 3. to Display x,y coordinates of all points");
				System.out.println("Enter 4 .to enter a point ");
				System.out.println("---------------------------------------------------------");
				System.out.print("enter your choice : ");
				choice = Point2D.sc.nextInt();
		
			switch(choice) {			
			case 1 : p.accept();
			         break;
			         
			case 2 : p.displaySpecificPoint();
			         break;
			   
			case 3 : p.displayAllPoint();
			         break;
			
			case 4 :  p.toFindDistance();
			          break;
			          
			case 5 : System.out.println("invalid input,try again!!");
			         break;        
			}
		}while(choice!=0);
	}

}
