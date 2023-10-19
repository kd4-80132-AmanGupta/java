package package2;
import java.util.Scanner;
import java.lang.Integer;

public class Assign1_q1 {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number here : ");
	int input = sc.nextInt();
	
	
	System.out.printf("Binary Equivalent of "+input+" : "+ Integer.toBinaryString(input)+"\n");
	System.out.printf("Hex Equivalent of "+input+" : "+ Integer.toHexString(input)+"\n");
	System.out.printf("Octal Equivalent of "+input+" : "+ Integer.toOctalString(input)+"\n");
	sc.close();
	
	

}
}
