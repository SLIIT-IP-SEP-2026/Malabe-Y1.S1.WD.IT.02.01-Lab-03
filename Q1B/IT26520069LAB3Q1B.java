
import java.util.Scanner;

public class IT26520069LAB3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 250;
        int kg;
        double amount, discount, finalAmount;

        System.out.print("Enter the number of kilograms: ");
        kg = input.nextInt();

        amount = price * kg;
        discount = amount * 0.10;
        finalAmount = amount - discount;

        System.out.println("Total amount = " + amount);
        System.out.println("Discount = " + discount);
        System.out.println("Amount to pay = " + finalAmount);

        input.close();
    }
}

