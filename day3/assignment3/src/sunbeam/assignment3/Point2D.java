package sunbeam.assignment3;

import java.util.Scanner;

//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following

public class Point2D {
	private int x;
	private int y;
	private Point2D arr[];
	private int noOfPoint;
	public static Scanner sc = new Scanner(System.in);
	
	
       public Point2D() {
		this.x=4;
		this.y=6;
	}
       public int getNoOfPoint() {
    	  return this.noOfPoint;
       }
              
	
	public void accept() {
	
		System.out.print("Enter the no. of points do you want to plot :");
		noOfPoint = Point2D.sc.nextInt();
		
		arr = new Point2D[noOfPoint];
		
		for(int i=0;i<arr.length;++i) {
			arr[i] = new Point2D();
			
	    System.out.print("Enter the value of x :");
		arr[i].x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		arr[i].y = sc.nextInt();
	  }
	}
	
	public void displaySpecificPoint() {
		System.out.println("you have "+ this.noOfPoint+" points :");
		System.out.println("choose a number from 0 to "+ (this.noOfPoint-1) +" to see specific points :");
	    int num = sc.nextInt();
	    System.out.println("("+arr[num].x + ","+arr[num].y+")"); 
	}
	
	public void displayAllPoint() {
		System.out.println("All points :");
		for( Point2D p : arr) {
	    System.out.print("("+p.x + ","+p.y+")"+"\n"); 
		}
	}
	
	public void toFindDistance() {
		double distance=0;
		System.out.print("enter x : ");
	    int x1 = sc.nextInt();
	    
	    System.out.print("enter y : ");
	    int y1 = sc.nextInt();
	   for(int i=0;i<arr.length;i++){
	    if(arr[i].x != x1 && arr[i].y !=y1) {
	       distance = Math.sqrt(Math.pow(arr[i].x-x1,2)+Math.pow(arr[i].y-y1,2));
	       System.out.println("distance : "+distance);
	    }
	   }
	    if(distance==0)
	    	System.out.println("coordinates of points are not matching");
//	    	
}
	}
	

