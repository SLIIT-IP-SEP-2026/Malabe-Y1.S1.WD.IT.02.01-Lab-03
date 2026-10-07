import java.util.Scanner;

public class IT26102779Lab3Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double OTAmount, OThours, OTRatePerHour, MonthlySalary, TotalSalary;
		
		System.out.print("Enter the monthly salary: ");
		MonthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		OThours = input.nextDouble();
		
		System.out.print(":Enter the OT hourly rate: ");
		OTRatePerHour = input.nextDouble();
		
		OTAmount = (OThours*OTRatePerHour);
		
		TotalSalary = (MonthlySalary + OTAmount);
		
		System.out.print("The total salary including OT is: " + TotalSalary);
	}
	
	
}
