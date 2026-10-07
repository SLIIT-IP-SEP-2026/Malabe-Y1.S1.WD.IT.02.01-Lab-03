import java.util.Scanner;
public class IT26510428Lab3Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price of 1kg of rice: ");
		int price=input.nextInt();
		System.out.println("Enter the number of kilograms you want to buy: ");
		int kilograms=input.nextInt();
		double total=price*kilograms;
		System.out.println("The total amount is: "+total);
	}
}
		
		

		