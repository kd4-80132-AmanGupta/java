package Tester;
import java.util.Scanner;

import assign5.*;

public class Test {
	public static void main(String args[]) {
  
//		Hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary
//				rate) for all hours worked in excess of 40 hours.
		Scanner sc = new Scanner(System.in);
		

//		Employee e3 = new SalariedEmployee();
//		e3.acceptData(sc);
//		e3.CalculateSalary();
		
		
//		Employee e = new HourlyEmployee();
//		e.acceptData(sc);
//		e.CalculateSalary();
		
//		Employee e1 = new CommissionEmployee();
//		e1.acceptData(sc);
//		e1.CalculateSalary();
//		
//
		Employee e2 = new BasePlusCommissionEmployee();
		e2.acceptData(sc);
		e2.CalculateSalary();
		
		
	}

}
