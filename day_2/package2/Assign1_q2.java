package package2;
import java.util.Scanner;

//Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.

public class Assign1_q2 {
	public static void main(String args[]) {
		double d1,d2,avg; 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a first double number here : ");
		if(sc.hasNextInt()) {
			System.out.println("invalid number, please enter double values.");	
			System.exit(0);
		}
		d1 = sc.nextDouble();
		System.out.print("enter a second double number here : ");
		if(sc.hasNextInt()) {
			System.out.println("invalid number, please enter double values.");	
			System.exit(0);
		}
		d2 = sc.nextDouble();
		avg=(d1+d2)/2;
		System.out.printf("Average of %f and %f = %f",d1,d2,avg);
	
		sc.close();
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


