import java.util.Scanner;

public class IT26102493Lab3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        double amount = price * kilograms;

        System.out.println("Amount to pay: " + amount);

        input.close();
    }
}