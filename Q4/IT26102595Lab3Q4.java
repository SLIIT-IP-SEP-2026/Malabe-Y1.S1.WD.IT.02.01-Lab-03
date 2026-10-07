import java.util.Scanner;
  public class IT26102595Lab3Q4{
   public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a five digit number:");
	int number = input.nextInt();
	
	 int d1 = number / 10000;
	 number = number % 10000;
	 
	 int d2 = number / 1000;
	 number = number % 1000;
	 
	 int d3 = number / 100;
	 number = number % 100;
	 
	 int d4 = number / 10;
	 int d5 = number % 10;
	 
	 System.out.println();
	 System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5);
	
	 

   }
   
   }