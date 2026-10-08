import java.util.Scanner;
public class IT26102717Lab3Q4{
	public static void main(String[]args){
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number : ");
		 int number = input.nextInt();
		 
		 int digit1 = number / 10000;
		 int remainder = number % 10000;
		 System.out.print(digit1+ " ");
		 
		 int digit2 = remainder / 1000;
		 int remainder1 = remainder % 1000;
		 System.out.print(digit2 + " ");
		 
		 int digit3 = remainder1 / 100;
		 int remainder2 = remainder1 % 100;
		 System.out.print(digit3+ " ");
		 
		 int digit4 = remainder2 / 10;
		 int remainder3 = remainder2 % 10;
		 System.out.print(digit4+" ");
		 
		  int digit5 = remainder3 / 1;
		 int remainder4 = remainder3 % 1;
		 System.out.print(digit5+" ");
		
	}
}