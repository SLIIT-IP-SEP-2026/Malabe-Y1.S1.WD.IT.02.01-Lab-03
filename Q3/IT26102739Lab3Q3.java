import java.util.Scanner;

public class IT26102739Lab3Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the Rupee amount: ");
		int Amount = input.nextInt();
		
		int note5000 = Amount / 5000;
		Amount %= 5000;
		System.out.println("5000 notes: " + note5000);
		
		int note1000 = Amount / 1000;
		Amount %= 1000;
		System.out.println("1000 notes: " + note1000);
		
		int note500 = Amount / 500;
		Amount %= 500;
		System.out.println("500 notes: " + note500);
		
		int note200 = Amount / 200;
		Amount %= 200;
		System.out.println("200 notes: " + note200);
		
		int note100= Amount / 100;
		Amount %= 100;
		System.out.println("100 notes: " + note100);
		
		int note50 = Amount / 50;
		Amount %= 50;
		System.out.println("50 notes: " + note50);
		
		int note20 = Amount / 20;
		Amount %= 20;
		System.out.println("20 notes: " + note20);
		
		int note10= Amount / 10;
		Amount %= 10;
		System.out.println("10 notes: " + note10);
		
		int note05 = Amount / 05;
		Amount %= 05;
		System.out.println("05 notes: " + note05);
		
		int note02 = Amount / 02;
		Amount %= 02;
		System.out.println("02 notes: " + note02);
		
		int note01= Amount / 01;
		Amount %= 01;
		System.out.println("0 notes: " + note01);
		
	}
}
		
		