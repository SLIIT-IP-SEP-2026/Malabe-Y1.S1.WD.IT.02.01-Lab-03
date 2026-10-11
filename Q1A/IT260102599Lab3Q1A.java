import java.util.Scanner;
public class IT260102599Lab3Q1A{public static void main(String[] args){
    double priceof1kgofrice, numbersofkilogram, TotalAmmount;
	
    Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice:");
	 priceof1kgofrice=input.nextDouble();
	 
	System.out.print("Enter the numbers of kilogram:");
	 numbersofkilogram=input.nextDouble();
	 
	 TotalAmmount=priceof1kgofrice*numbersofkilogram;
	 
	 System.out.print("TotalAmmount :"+TotalAmmount);
	 
	 
	 
	 
		
	}
}