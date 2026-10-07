import java.util.Scanner;
public class IT26102690Lab3Q1B {
	public static void main(String[] args){
		double price,amount,TotalAmt,discount,disAmount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1KG rice :");
		price = input.nextDouble();
		System.out.print("No of KGs you wnat to buy :");
		amount = input.nextDouble();
		
		TotalAmt = price * amount ;
		discount = (price * amount)* 10/100;		
		disAmount = TotalAmt - discount;
		System.out.println("The total amount is :" + disAmount);
		
		
	}
}