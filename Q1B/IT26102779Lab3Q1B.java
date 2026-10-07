import java.util.Scanner;

public class IT26102779Lab3Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double PricePerkg,NoOfKg,AmountToPay;
		double Discount = 10;
		
		System.out.print("Enter the price of 1 kg of rice: ");
		
		PricePerkg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		
		NoOfKg = input.nextDouble();	
		AmountToPay = (PricePerkg * NoOfKg)*((100 - Discount)/100);
		System.out.println("Amount to pay with 10% discount is: " + AmountToPay);
		
	}
}