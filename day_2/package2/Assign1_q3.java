package package2;
import java.util.Scanner;

public class Assign1_q3 {
	int choice;
	double price_Samosa;
	double price_Idli;
	double price_Dosa;
	int qty_Samosa;
	int qty_Idli;
	int qty_Dosa;
	double totalBill;
	
	Assign1_q3(){
		this.price_Samosa=20;
		this.price_Idli=15;
		this.price_Dosa=35;
		this.qty_Dosa=0;
		this.qty_Idli=0;
		this.qty_Samosa=0;
	}
	
	Assign1_q3(double price_Samosa, double price_Idli, double price_Dosa){
		this.price_Samosa=price_Samosa;
		this.price_Idli=price_Idli;
		this.price_Dosa=price_Dosa;
		this.qty_Dosa=0;
		this.qty_Idli=0;
		this.qty_Samosa=0;
	}
	
	
	void toGenerateBill(){
		
		this.totalBill=this.qty_Samosa*this.price_Samosa;
		this.choice=0;
		
	}
	
	
//	3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//	2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//  When user enters 'Generate Bill' option , display total bill & exit.
	
	public static void main(String args[]) {
		Assign1_q3 a = new Assign1_q3();
		do{
			System.out.println("***********************************************");
			System.out.println("Enter 1. to order Dosa");
			System.out.println("Enter 2. to order Samosa");
			System.out.println("Enter 3. to order Idli");
			System.out.println("Enter 4. to Generate Bill");
			System.out.println("**********************************************");
			Scanner sc = new Scanner(System.in);
			System.out.print("enter your choice :");
			a.choice = sc.nextInt();
			System.out.println("----------------------------------------------");
			switch(a.choice){
			
			case 1 : System.out.print("Enter the quantity of 'Dosa' you want :");
			         a.qty_Dosa = sc.nextInt();
			         break;			
			case 2 : System.out.print("Enter the quantity of 'Samosa' you want :");
	                 a.qty_Samosa = sc.nextInt();
			         break;
			case 3 : System.out.print("Enter the quantity of 'Idli' you want :");
	                 a.qty_Idli = sc.nextInt();
			         break;
			case 4 : a.toGenerateBill();
			         System.exit(0);       		    
			}
		}
			while(true);
		
			
		}
	
}

