package assign5;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	
	
	public CommissionEmployee() {
	}
	
	public CommissionEmployee(String firstName, String lastName, int social_Security_Number, double grossSales,
			double commissionRate) {
		super(firstName, lastName, social_Security_Number);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		
		System.out.print("Enter Gross Sales : ");
		this.grossSales = sc.nextDouble();
		
		System.out.print("Enter Commission Rate : ");
		this.commissionRate = sc.nextDouble();
	}

	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", " + super.toString() + "]";
	}

	@Override
	public void CalculateSalary() {
		double totalSalary;
		totalSalary = this.commissionRate/100 * this.grossSales;
		System.out.println("Total Salary : "+ totalSalary);
		
		
	} 
	
	
	
	

}
