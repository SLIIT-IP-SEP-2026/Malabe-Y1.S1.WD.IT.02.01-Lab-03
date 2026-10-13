import java.util.Scanner;

public class IT26102766Lab3Q2{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
	   
	   double monthlySalary,OT_hours,OT_hourlyRate,OT_amount,totalSalary;
	   
	   System.out.print("Enter the monthly salary : ");
	   monthlySalary = input.nextDouble();
	   
	   System.out.print("Enter the number of OT hours : ");
	   OT_hours = input.nextDouble();
	   
	   System.out.print("Enter the OT hourly rate : ");
	   OT_hourlyRate = input.nextDouble();
	   
	   OT_amount = OT_hours * OT_hourlyRate;
	   totalSalary = monthlySalary + OT_amount;
	   

       System.out.print("The total salary including OT is : "+totalSalary);	   

	}	
  }