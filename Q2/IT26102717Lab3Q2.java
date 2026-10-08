import java.util.Scanner;
public class IT26102717Lab3Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary :");
		double salary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours : ");
		double hours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate : ");
		double rate = input.nextDouble();
		
		System.out.print("The total salary including OT is : ");
		double total = salary + (hours*rate);
		System.out.print(total);
	}
}