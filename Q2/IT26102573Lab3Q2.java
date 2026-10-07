import java.util.Scanner;

 public class IT26102573Lab3Q2{
    public  static void main(String [] args){
	
         Scanner input = new Scanner(System.in);	
		    double MonthlySalary,OThours,OTHourlyRate,TotalSalary,OTAmount;
			
			System.out.println("Enter the monthly salary:");
			  MonthlySalary =input.nextDouble();
			  
			  System.out.println("Enter the number of OT hours:");
			   OThours =input.nextDouble();
			   
			   System.out.println("Enter the  OT Hourly Rate:");
			   OTHourlyRate =input.nextDouble();
			   
			   System.out.println("Enter the  OT Hourly Rate:");
			   OTHourlyRate =input.nextDouble();
			   
			   OTAmount = OThours * OTHourlyRate;
               TotalSalary = MonthlySalary + OTAmount;
			   
			
			   
			     System.out.println("the total salary includeing OT is :"+ TotalSalary);
				 }
				 }
			   
			   
			
			   
			   
			   
			   
			   
		