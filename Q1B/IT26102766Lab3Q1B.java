import java.util.Scanner;

public class IT26102766Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKg,kilograms,subtotal,discount,finalAmount;
		
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = scanner.nextDouble();
		
        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = scanner.nextDouble();

        subtotal = pricePerKg * kilograms;

        discount = subtotal * 0.10;

        finalAmount = subtotal - discount;

        System.out.println("The total amount with 10% discount is : "+finalAmount);
        
    }
}