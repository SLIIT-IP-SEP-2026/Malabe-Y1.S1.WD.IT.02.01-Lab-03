import java.util.Scanner;
public class IT26102717Lab3Q1A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg :");
		double price = input.nextDouble();
		
		System.out.print("Enter the no of kilograms you want to buy :");
		int no = input.nextInt();
		
		double total = (price * no);
		
		System.out.print("The total amount is : "+ total);
		
	}
}