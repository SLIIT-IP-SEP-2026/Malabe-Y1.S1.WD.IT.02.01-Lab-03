import java.util.Scanner;
 public class IT26102404Lab3Q1A {
  public static void main (String[] args) {
   double pricePerKg,amount,total;
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the price of 1kg of rice:");
   pricePerKg = input.nextDouble();
   
   System.out.print("enter the number of kg you want to buy:");
   double kg = input.nextDouble();
   
   double total = pricePerKg*kg;
   
   System.out.println("The total amount is:" + total);
  }
 }