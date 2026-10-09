import java.util.Scanner;
public class IT26102467Lab3Q2{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the montly salary:");
  double salary = input.nextDouble();

  System.out.print("Enter the number of OT hours:");
  int hours = input.nextInt();

  System.out.print("Enter the OT hourly rate:");
  int rate = input.nextInt();

  double OT_Amount =  hours * rate;
  double Total_salary =salary + OT_Amount;

 System.out.print("The total salary including OT is:"+Total_salary);







  }
}