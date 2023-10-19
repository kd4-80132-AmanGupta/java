package sunbeam.assignment3;
import java.util.Scanner;

//Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.

public class Assign3_q3 {
	
	private float milesDriven;
	private float cost_Gasoline;
	private float avgMilesPerGallon;
	private float parkFees;
	private float tollfees;
	public static Scanner sc = new Scanner(System.in);
	
	public Assign3_q3() {
		
	}
	
	public void MilesDrivenPerDay() {
		System.out.print("Enter how many miles you drive per day : ");
		this.milesDriven = sc.nextFloat();
		
	}
	
	public void costPerGallonOfGasoline() {
		System.out.print("Enter cost per gallon of gasoline : ");
		this.cost_Gasoline = sc.nextFloat();
	}
	
	
	public void  AverageMilesPerGallon() {
	
		this.cost_Gasoline = sc.nextFloat();
	}

}
