import java.util.Scanner;

public class IT26520069LAB3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 250;
        int kg;

        System.out.print("Enter the number of kilograms: ");
        kg = input.nextInt();

        double amount = price * kg;

        System.out.println("Amount to pay = " + amount);

        input.close();
    }
}