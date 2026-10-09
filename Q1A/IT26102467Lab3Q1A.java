import java.util.Scanner;
public class IT26102467Lab3Q1A{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the price of 1kg of rice:");
  int price = input.nextInt();

  System.out.print("Enter the number of kilograms you want to buy:");
  int kilograms = input.nextInt();

  int total = price*kilograms;

  System.out.print("The total amount is:"+total);













   }
}