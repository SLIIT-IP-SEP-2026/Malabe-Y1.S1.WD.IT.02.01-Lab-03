import java.util.Scanner;

public class IT26100946Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        double totalAmount = pricePerKg * quantity;
		double discount = totalAmount*90/100;
        System.out.println("The Total amount with 10% discount: "+discount);
        scanner.close();
    }
}