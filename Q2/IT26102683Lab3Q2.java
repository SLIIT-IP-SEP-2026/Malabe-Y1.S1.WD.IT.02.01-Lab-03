import java.util.Scanner;
public class IT26102683Lab3Q2{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:-");
		int salary = input.nextInt();
		
		System.out.print("Enter the number of OT hours:-");
		int ot_hours =input.nextInt();
		
		System.out.print("Enter the OT hourly rate:-");
		int rate = input.nextInt();
		
		int ot_amount = ot_hours * rate;
		double total_salary = salary + ot_amount;
		
		System.out.print("The total salary including OT is:-"+total_salary);
	}	
}	