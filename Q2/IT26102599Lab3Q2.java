import java.util.Scanner;

public  class IT26102599Lab3Q2{
	public static void main (String[] args){
	double  MonthlySalary , OThours , OTHourlyRate , OTAmount , TotalSalary;
	Scanner input = new Scanner(System.in);
	System.out.print(" Monthly Salary:");
	MonthlySalary = input.nextDouble();
	
	System.out.print(" OT Hourly Rate :");
	OTHourlyRate = input.nextDouble();
	 
	System.out.print(" OT hours:");
	OThours=  input.nextDouble();
	
	OTAmount= OThours * OTHourlyRate;
	
	TotalSalary = MonthlySalary + OTAmount;
	System.out.print("TotalSalary  :" + TotalSalary);
}
}	
	