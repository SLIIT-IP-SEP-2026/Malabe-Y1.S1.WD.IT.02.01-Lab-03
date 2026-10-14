import java.util.Scanner;
	public class IT26102448Lab3Q1A{
		public static void main (String[] args){
		double PriceOfa1kg,Kilograms,Total;
		
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg rice:");
		
		PriceOfa1kg = Input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		
		Kilograms = Input.nextDouble();
		Total = PriceOfa1kg*Kilograms;
		
		
		
		
		
		System.out.print("Total amount with Discount:" +Total);
		}
	
}