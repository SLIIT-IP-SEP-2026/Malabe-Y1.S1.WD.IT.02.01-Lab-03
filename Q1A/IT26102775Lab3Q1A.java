import java.util.Scanner;
public class IT26102775Lab3Q1A{
 public static void main(String[] args){
  double price_per_kg, no_of_kg, total_amount;
 
  //Defining the object
  Scanner input = new Scanner(System.in);
  
  //Getting inputs from the keyboard 
  System.out.println("Enter the price of 1kg of rice : ");
  price_per_kg = input.nextDouble();
  
  System.out.println("Enter the number of kilograms you want to buy : ");
  no_of_kg = input.nextDouble(); 
  
  total_amount = price_per_kg * no_of_kg;
  System.out.println("The total amount is:" + total_amount);
 }
}

  
 

 
 