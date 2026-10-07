import java.util.Scanner;
public class IT26102493Lab3Q1B{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
 
  System.out.println("Enter the price of 1kg of rice:");
  double price = input.nextInt();

  System.out.println("Enter the number of kilograms you want to buy:");
  int kilograms = input.nextInt();

  double total = price*kilograms;
  double discount = total*10/100;
  double Total_amount = total-discount;
  
  System.out.println("The total amount with 10% discount is:"+Total_amount);
  

 
 }
}