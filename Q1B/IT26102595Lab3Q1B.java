import java.util.Scanner;
   public class IT26102595Lab3Q1B{
    public static void main(String[] args){
            

       Scanner input = new Scanner(System.in);	
        System.out.print("Enter the price of 1kg of rice:");
           double price = input.nextDouble();
              
        System.out.print("enter the number of kg you want to buy:");
            int kg = input.nextInt();
    
           double total = price * kg;
		   double discount = total *10/100;
		   double finalAmount = total - discount;

    System.out.println("/nthe total amount with 10% discount ia:" + finalAmount);		   
	  
 }
   }
 