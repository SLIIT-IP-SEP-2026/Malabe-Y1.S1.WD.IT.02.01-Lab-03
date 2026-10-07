import java.util.Scanner;

public class IT26102554Lab3Q1A { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

   System.out.println("Enter price of 1kg of rice");
	double price=input.nextDouble() ;
	
	System.out.print("Enter number of kg you want need to buy:");
	int kg = input.nextInt();
	
	double total =price * kg;
	
	System.out.println("net total amount:" + total);
	}
}	