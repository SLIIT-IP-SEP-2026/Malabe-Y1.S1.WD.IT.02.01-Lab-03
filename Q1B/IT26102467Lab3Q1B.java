import java.util.Scanner; 
public class IT26102467Lab3Q1B{
 public static void main(String[]args){
 Scanner input = new Scanner(System.in);

  System.out.print("Enter the price of 1kg of rice:");
  double price = input.nextDouble();
 
  System.out.print("Enter the number of kilograms you want to buy:");
  int number = input.nextInt();

  double total = price*number;
  double discount = total*10/100;
  double total_amount= total-discount;

  System.out.print("The total amount with 10% discount is:"+total_amount);


 }
}