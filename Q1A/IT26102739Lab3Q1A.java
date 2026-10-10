import java.util.Scanner;

public class IT26102739Lab3Q1A
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double pricePerKilo = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double noOfKilos = input.nextDouble();
		
		double totalAmount = pricePerKilo*noOfKilos;
		System.out.println("The total amount is: " + totalAmount);
	}
}
		