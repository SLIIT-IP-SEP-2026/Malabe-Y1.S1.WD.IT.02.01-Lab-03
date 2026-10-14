import java.util.Scanner; 
public class IT26102775Lab3Q2{
 public static void main(String[] args){
  
  //Defining the object 
  Scanner input = new Scanner(System.in);
  
  //Getting the inputs 
 System.out.println("Enter the monthly salary: ");
 double monthly_salary = input.nextDouble();
 System.out.println("Enter the number of OT hours :");
 double OT_Hrs = input.nextDouble();
 System.out.println("Enter the OT hourly rate :");
 double OT_hrs_rate = input.nextDouble();

  //Calculation 
  double OT_amt = OT_Hrs * OT_hrs_rate;
  double Total_salary = monthly_salary + OT_amt;
  
  //Output 
  System.out.println("The total salary including OT is : " + Total_salary);
 }
}
