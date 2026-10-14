import java.util.Scanner;
	public class IT26102448Lab3Q1B{
		public static void main (String[] args){
		double PriceOfa1kg,Kilograms,Total,D,Discount,TotalWithDiscount;
		
		D=0.1;
		
		
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the price of 1kg rice:");
		
		PriceOfa1kg = Input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		
		Kilograms = Input.nextDouble();
		Total = PriceOfa1kg*Kilograms;
		Discount = Total*D;
		
		TotalWithDiscount=Total-Discount;
		
		
		
		
		
		System.out.print("Total amount with Discount:" +TotalWithDiscount);
		}
	
}