import java.util.Scanner;

public class IT26102739Lab3Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double pricePerKilo = input.nextDouble();
		
		System.out.print("Enter the number of  kilograms: ");
		double noOfKilos = input.nextDouble();
		
		double totalAmount = pricePerKilo*noOfKilos;
		
		double discount = totalAmount*0.9;
		System.out.println("The total amount with the 10% disount is: " + discount);
	}
}