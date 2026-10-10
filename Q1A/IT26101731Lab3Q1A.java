import java.util.Scanner;
public class IT26101731Lab3Q1A{
    public static void main(String []args){
	    double price,kilograms,T_amount;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice:");
		price=input.nextDouble();
		
		System.out.println("Enter the number of kilograms:");
		kilograms=input.nextDouble();
		
		T_amount=price*kilograms;
		System.out.println("The total amount is "+T_amount);
		}
    }