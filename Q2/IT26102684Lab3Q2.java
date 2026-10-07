import java.util.Scanner;

	public class IT26102684Lab3Q2 { 
	public static void main(String[] args) { 

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the mothly salary:");
	double monthlySalary = input.nextDouble();
	
	System.out.println("Enter the OT hours:");
	double otHours = input.nextDouble();
	
	System.out.println("Enter the OT hourly rate:");
	double otHourlyRate = input.nextDouble();
	
	double otAmount = otHours*otHourlyRate;
	double toalSalary = monthlySalary + otAmount;
	
	System.out.println("OT Amount: " + otAmount);
	System.out.println("Total Salary: " + toalSalary);
 
	}
	}