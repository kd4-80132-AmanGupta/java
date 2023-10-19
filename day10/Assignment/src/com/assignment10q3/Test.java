package com.assignment10q3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {
//	Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//	functionality:
	
	public static void main(String args[]) {
		
		class idComparator implements Comparator<Employee>{
			/*d*/			 public int compare(Employee e1,Employee e2){
							 int diff = e1.getEmpId() - e2.getEmpId();
							 return diff;
						 }
						
					}
		
		List<Employee> listEmp = new LinkedList<>();
		Employee e;
		ListIterator<Employee> lItr;
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		do {
			System.out.println("----------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Add Employee");
			System.out.println("2. delete Employee");
			System.out.println("3. find Employee");
			System.out.println("4. sort Employee");
			System.out.println("5. edit Employee");
			System.out.println("6. display Employee");
			System.out.println("----------------------------");
			System.out.print("enter your choice : ");
			System.out.println("\n-----------------------");			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: e = new Employee();
			        e.acceptData(sc);
			        listEmp.add(e);
				break;
				
			case 2:System.out.print("Enter id of employee to delete ");
			       int id = sc.nextInt();
			       e = new Employee();
			       e.setEmpId(id);
			      int index = listEmp.indexOf(e);
			       if(index!=-1) {
			      listEmp.remove(index);
			       System.out.println("employee deleted !!");
			       }
			       else
			    	   System.out.println("Employee which u wnt to delete is not present");
				break;
				
			case 3:System.out.println("Enter your id :");
			       int indx = sc.nextInt();
			      e= new Employee();
			       e.setEmpId(indx);
			       if(listEmp.contains(e)){
			    	   int i = listEmp.indexOf(e);
			    	   System.out.println("Employee found at index "+i+":\n"+listEmp.get(i));
			       }
			    	   else 
			    		   System.out.println("Employee not found"); 
			       
				break;
				
			case 4: idComparator isCmp = new idComparator();
			        Collections.sort(listEmp,isCmp);
			        System.out.println(listEmp);
			        
			        break;
			        
			
			case 5: System.out.println("enter employee id to update/edit");
			        int i =sc.nextInt();
			        e = new Employee();
			        e.setEmpId(i);
			        
			        int index1 = listEmp.indexOf(e);
			        if(index1 != -1) {
			        	listEmp.set(index1, new Employee(2,"aman",3400));
			        }
			        else
			        	System.out.println("employee not found which u wnt to update");
			        break;
			        
			case 6 :  lItr = listEmp.listIterator();
			          while(lItr.hasNext()) {
			        	 e = lItr.next();
			        	 System.out.println(e); 
			          }
				 break;
				
		   default : System.out.println("invalid choice");
				break;
				
				
			}
			
		}while(choice!=0);
		
		
		
	}

}
