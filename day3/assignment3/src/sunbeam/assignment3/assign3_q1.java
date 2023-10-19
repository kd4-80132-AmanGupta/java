package sunbeam.assignment3;

import java.util.Scanner;

//
//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".

public class assign3_q1 {
	
	private int accountNumber;
	private double balance=20000;
	private double charges;
	private double creditAmount;
	private double allowedCreditLimit=30000;
	
	assign3_q1(){
		
	}
	
	void acceptAccountDetails() {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter Account Details : ");
         System.out.print("Enter Account Number : ");
         this.accountNumber = sc.nextInt();
         
         System.out.print("Enter Balance Amount : ");
         this.balance = sc.nextDouble();
         
         System.out.print("Enter Charges(Expenditures) : ");
         this.charges = sc.nextDouble();
         
         System.out.print("Enter creditAmount : ");
         this.creditAmount = sc.nextDouble(); 
	}

	void check() {
		balance = balance + charges - creditAmount;
		if(balance>allowedCreditLimit) {
			System.out.println("Credit limit exceeded");
		}	
	}
}
	


