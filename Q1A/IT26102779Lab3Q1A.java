import java.util.Scanner;

public class IT26102779Lab3Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double PricePerkg,NoOfKg,AmountToPay;
		
		System.out.print("Enter the price of 1 kg of rice: ");
		
		PricePerkg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		
		NoOfKg = input.nextDouble();	
		AmountToPay = PricePerkg * NoOfKg;
		System.out.println("Amount to pay: " + AmountToPay);
		
	}
}