package assign5;

import java.util.Scanner;

public abstract class Employee {
	
	private String firstName;
	private String lastName; 
	private int social_Security_Number;
	

	public Employee() {
	}
	
	
	public Employee(String firstName, String lastName, int social_Security_Number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.social_Security_Number = social_Security_Number;
	}
	
	public void acceptData(Scanner sc){
		System.out.println("Enter Employee details : ");
		
		System.out.print("Enter First Name : ");
		 this.firstName = sc.next();
		 
		 System.out.print("Enter Last Name : ");
		 this.lastName = sc.next();
		 
		 System.out.print("Enter S.S.N Number: ");
		 this.social_Security_Number = sc.nextInt();
	}
	
	  public abstract void CalculateSalary();


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSocial_Security_Number() {
		return social_Security_Number;
	}
	public void setSocial_Security_Number(int social_Security_Number) {
		this.social_Security_Number = social_Security_Number;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", social_Security_Number="
				+ social_Security_Number + "]";
	}
	
	
	
	
	
}


