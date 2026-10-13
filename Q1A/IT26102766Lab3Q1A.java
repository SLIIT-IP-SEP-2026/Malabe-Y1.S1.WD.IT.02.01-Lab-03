import java.util.Scanner;

public class IT26102766Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerKg,kilograms,totalAmount;
		
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = scanner.nextDouble();

        totalAmount = pricePerKg * kilograms;

        System.out.println("The total amount is : "+totalAmount);
       
    }
}