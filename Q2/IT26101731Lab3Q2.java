import java.util.Scanner;
public class IT26101731Lab3Q2{
    public static void main(String []args){
	    Scanner input=new Scanner(System.in);
	   
	    System.out.print("Enter the monthly salary: ");
	    double monthly_salary=input.nextDouble();
	   
	    System.out.print("Enter the number of OT hours: ");
	    double OT_hours=input.nextDouble();
	   
	    System.out.print("Enter the OT hourly rate: ");
	    double OT_hourly_rate=input.nextDouble();
	    
		double OT_amount=OT_hours*OT_hourly_rate;
		double total_salary=monthly_salary+OT_amount;
		
	    System.out.print("The total salary including OT is: "+total_salary);
		}
    }