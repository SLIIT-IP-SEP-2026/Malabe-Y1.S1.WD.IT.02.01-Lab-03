import java.util.Scanner;

public class IT26101820Lab3Q1A{ 
  public static void main(String[]args){
 
    Scanner input=new Scanner(System.in); 
  
    System.out.print("enter the price of 1kg of rice:");
    double price= input.nextDouble();
  
    System.out.print("enter the no of kilograms you want to buy:");
    double kg = input.nextDouble();
	
	double total = price*kg;
	
	System.out.println("The total amount is:" + total);
	}
}	