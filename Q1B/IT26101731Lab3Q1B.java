import java.util.Scanner;
public class IT26101731Lab3Q1B{
    public static void main(String []args){
	    double price,kilograms,T_amount,dis_amount;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice:");
		price=input.nextDouble();
		
		System.out.println("Enter the number of kilograms:");
		kilograms=input.nextDouble();
		
		T_amount=price*kilograms;
		dis_amount=T_amount-(T_amount*10)/100;
		System.out.println("Total amount after the 10% discount is: "+dis_amount);
		}
    }