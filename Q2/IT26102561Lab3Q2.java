import java.util.Scanner;
public class IT26102561Lab3Q2{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the monthly salary:");
		double MonSalary = input.nextDouble();
		System.out.print("Enter the number of OT hours:");
		double OTHours = input.nextDouble();
		System.out.print("Enter the OT Hourly Rate:");
		double OTHoursRate = input.nextDouble();
		double OTAmount = OTHours*OTHoursRate;
		double TotalSalary = MonSalary+OTAmount;
		System.out.print("The total salary including OT is:"+TotalSalary);
	}
}