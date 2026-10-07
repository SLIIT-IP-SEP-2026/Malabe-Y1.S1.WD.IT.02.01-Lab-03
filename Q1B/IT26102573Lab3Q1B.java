import java.util.Scanner;
 public class IT26102573Lab3Q1B{
    public  static void main(String [] args){
         Scanner input = new Scanner(System.in);	
		    double price,kg,total,discount,finaltotal;
			
			System.out.println("Enter the price oc 1kg og rice:");
			  price =input.nextDouble();
			  
			  System.out.println("Enter the number of kg:");
			  kg =input.nextDouble();
			  
			  total = price*kg;
			  discount= total*10/100;
			  finaltotal = total-discount;
			  
			  System.out.println("the total amount withe 10% discount is:" + finaltotal);
			  
	}
 }
			  
