import java.util.Scanner;

class IT26102404Lab3Q1B {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

       int price, kg;
       double total, discount;

       System.out.print("Enter the price of 1kg of rice: ");
       price = input.nextInt();

       System.out.print("Enter the number of kilograms you want to buy: ");
       kg = input.nextInt();

       total = price * kg;
       discount = total * 10 / 100;
       total = total - discount;

       System.out.println("total amount with 10% discount is: " + total);
    }
}