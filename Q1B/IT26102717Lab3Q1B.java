import java.util.Scanner;
public class IT26102717Lab3Q1B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg :");
		double price = input.nextDouble();
		
		System.out.print("Enter the no of kilograms you want to buy :");
		int no = input.nextInt();
		
		
		System.out.print("The total amount with 10% discount is : ");
		double total = (price * no);
		double afterdiscount = (total*90)/100;
		System.out.print(afterdiscount);
	}
}