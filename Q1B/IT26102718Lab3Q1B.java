import java.util.Scanner;
public class IT26102718Lab3Q1B {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
double price,kilograms,total,discount,amount;
System.out.print("Enter the price of 1 kg of rice: ");
price=input.nextDouble();
System.out.print("Enter the number of kilograms: ");
kilograms=input.nextDouble();
total=price*kilograms;
discount=total*10/100;
amount=total-discount;
System.out.println("Total bill: Rs. " + total);
System.out.println("Discount: Rs. " + discount);
System.out.println("Amount to pay:Rs."+amount);
input.close();
}
}
