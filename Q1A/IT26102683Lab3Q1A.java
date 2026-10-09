import java.util.Scanner;
public class IT26102683Lab3Q1A{
 public static void main (String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the price of 1Kg of rice:");
	 double price = input.nextDouble();
	 
	 System.out.print("Enter the number of Kilograms you want to buy:");
	 int no = input.nextInt();
	 double total = (price * no);
	 System.out.print("The total amount is: "+total);
 }
}