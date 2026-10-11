import java.util.Scanner;

public class IT26101727Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePerKg;
        double kilograms;
        double totalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        kilograms = input.nextDouble();

        totalAmount = pricePerKg * kilograms;

        System.out.println("Total amount to pay: " + totalAmount);

        input.close();
    }
}
