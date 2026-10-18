public class IT26102665Lab3Q1B {
     public static void main(String[] args)
	    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: "):
		double pricePerKg = scanner.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kilograms = scanner.nextDouble();
		
		double totalAmount = pricePerKg * kilograms;
		double discount = totalAmount * 0.10;
		double finalAmount = totalAmount - discount;
		
		System.out.printLn("The total amount is: " + totalAmount):
		System.out.printLn("The amount after 10% discount is: " + finalAmount);
		
			scanner.close():
	}