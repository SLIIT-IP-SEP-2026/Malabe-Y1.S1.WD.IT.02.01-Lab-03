import java.util.Scanner;
public class IT26102553Lab3QIA {
	public static void main (String[]args){
		
		    double priceperkg, quantity , totalamount;
			
            Scanner input = new Scanner(System.in);
			
			
			
			System.out.print("enter the price of 1kg of rice: ");
			priceperkg = input.nextDouble();
			
			System.out.print("enter the number of kilograms you want to buy:");
			quantity = input.nextDouble();
			
			totalamount = priceperkg * quantity;
			
			System.out.println();
			System.out.print("The total amount is:" + totalamount);
			
			input.close();
	}	
	
}