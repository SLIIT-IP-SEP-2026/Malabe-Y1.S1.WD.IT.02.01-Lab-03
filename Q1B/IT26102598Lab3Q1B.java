import java.util.Scanner;
public class IT26102598Lab3Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		double price = input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		double quantity = input.nextDouble();
		double total= price * quantity;
		double finalAmount = total * 0.90;
		System.out.println("\nThe total amount with 10% dicount is: " + finalAmount);
	}
}	