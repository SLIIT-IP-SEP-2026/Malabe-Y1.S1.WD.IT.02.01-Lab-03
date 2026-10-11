import java.util.Scanner;

public class IT26101727Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePerKg;
        double kilograms;
        double totalAmount;
        double discount;
        double finalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        kilograms = input.nextDouble();

        totalAmount = pricePerKg * kilograms;
        discount = totalAmount * 10 / 100;
        finalAmount = totalAmount - discount;

        System.out.println("Total bill: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay after discount: " + finalAmount);

        input.close();
    }
}
