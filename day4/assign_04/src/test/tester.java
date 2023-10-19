package test;
import java.util.Scanner;

import assign4.*;

public class tester {
	
	public static void main(String args[]) {
		 int choice, size;
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("enter the size of basket : ");
		 size = sc.nextInt();
		 
		 Fruit farr[] = new Fruit[size];
		 int index = 0;
       
         do {
        	 System.out.println("***************************************************************"); 
        	 System.out.println("Enter 0. to Exit");
        	 System.out.println("Enter 1. to Add Mango");
        	 System.out.println("Enter 2. to Add Orange");
        	 System.out.println("Enter 3. to Add Apple");
        	 System.out.println("Enter 4. to Display names of all Fruits in the Basket");
        	 System.out.println("Enter 5. to Display name,color,weight,taste of all fresh fruits,in the basket."); 
        	 System.out.println("Enter 6. to Display tastes of all stale(not fresh) fruits in the basket.");
        	 System.out.println("Enter 7. to Mark a fruit as stale");
        	 System.out.println("Enter 8. to Mark all sour fruits stale");
        	 System.out.println("***************************************************************"); 
        	 
        	 System.out.print("Enter your choice : ");
        	 choice = sc.nextInt();
        	 System.out.println("----------------------");
        	 
        	 switch(choice) {
        	 
        	 case 1 : if(index<size) {
        		      farr[index]= new Mango();
        	          farr[index++].accept();
        	 }
        	          break;
        	          
        	 case 2 : if(index<size) {
   		              farr[index]= new Orange();
	                  farr[index++].accept();
	         }
	                  
        	          break; 
        	          
        	 case 3 : if(index<size) {
		              farr[index]= new Apple();
                      farr[index++].accept();
            }
                 
   	                  break; 
   	                  
        	 case 4 : for(Fruit f:farr) {
        			  if(f!= null) {
        				 System.out.println(f.getName()); 
        			 } 
        	 }
        		       break;
        		       
        	 case 5 : for(Fruit f:farr) {
   			          if(f!= null) {
   				         f.display();
   			         } 
   	         }
   		               break; 
   		              
        	 case 6 :for(Fruit f : farr) {
        		     if(f!=null) {
        		     if(!f.isFresh())
        		    	 System.out.println(f.getName()+" : "+f.taste()); 
        		 }
        	 }
        	          break;
        	          
        	 case 7 :System.out.println("enter a number between 0 to "+ (farr.length-1) + " to marks fruit taste as false");
        		     int i = sc.nextInt();
        		     if(farr[i]!=null)
        		     farr[i].setFresh(false);
        		     break;
        		     
//        	 case 8 : for(Fruit f : farr) {
//        		         if(f!=null) {
//        		        	 f.
//        		         }
//        	 }
//        		  
        	 default : System.out.println("invalid input, Try Again !!!");
        	           break;
   				       
        		 
        	 
        	 }
        	 
         }while(choice!=0);
         
        
		
		
	}

}
