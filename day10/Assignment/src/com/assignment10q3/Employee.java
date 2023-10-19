package com.assignment10q3;

import java.util.Scanner;

public class Employee {
	
//	Create LinkedList<> of Employee. Perform add, delete, ﬁnd, sort, edit functionality in a menu driven program. Refer hint below for edit/update
//	functionality:
	
	private int EmpId;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empId, String name, double salary) {
		EmpId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("enter Employee details : ");
		
		System.out.print("enter empId : ");
	    this.EmpId = sc.nextInt();
	     
	    sc.nextLine();
	    System.out.print("enter name : ");
	    this.name = sc.nextLine();
	    
	    System.out.print("enter salary : ");
	    this.salary = sc.nextDouble();
		
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
		Employee e = (Employee)obj;
		if(this.EmpId == e.EmpId)
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	
	
	
	

}
