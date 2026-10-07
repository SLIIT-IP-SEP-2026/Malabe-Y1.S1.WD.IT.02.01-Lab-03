import java.util.Scanner;
public class IT26102690Lab3Q1A {
	public static void main(String[] args){
		double price,amount,TotalAmt;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1KG rice :");
		price = input.nextDouble();
		System.out.print("No of KGs you wnat to buy :");
		amount = input.nextDouble();
		
		TotalAmt = price * amount ;
		System.out.println("The total amount is :" + TotalAmt);
		
		
	}
}