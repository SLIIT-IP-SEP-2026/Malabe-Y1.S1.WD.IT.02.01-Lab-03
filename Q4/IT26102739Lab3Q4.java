import java.util.Scanner;

public class IT26102739Lab3Q4
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a five digit number: ");
		int number = input.nextInt();
		
		int num1 = number/10000;
		number = number % 10000;
		System.out.print(num1 + " ");
		
		int num2 = number/1000;
		number = number % 1000;
		System.out.print(num2 + " ");
		
		int num3 = number/100;
		number = number % 100;
		System.out.print(num3 + " ");
		
		int num4 = number/10;
		number = number % 10;
		System.out.print(num4 + " ");
		
		int num5 = number/1;
		number = number % 1;
		System.out.print(num5 + " ");
	}
}