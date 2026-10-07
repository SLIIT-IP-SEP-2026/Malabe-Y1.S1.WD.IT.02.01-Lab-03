import java.util.Scanner;
public class IT26102690Lab3Q3 {
	public static void main(String[] args){
		int amount,num5000,num1000,num500,num200,num100,num50,num20,num10,num5,num2,num1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rupee amount :");
		amount = input.nextInt();
		num5000 = amount / 5000;
		amount = amount % 5000;
		num1000 = amount / 1000;
		amount = amount % 1000;
		num500 = amount / 500;
		amount = amount % 500;
		num200 = amount / 200;
		amount = amount % 200;
		num100 = amount / 100;
		amount = amount % 100;
		num50 = amount / 50;
		amount = amount % 50;
		num20 = amount / 20;
		amount = amount % 20;
		num10 = amount / 10;
		amount = amount % 10;
		num5 = amount / 5;
		amount = amount % 5;
		num2 = amount / 2;
		amount = amount % 2;
		num1 = amount / 1;
		amount = amount % 1;
		System.out.println("5000 notes -" + num5000);
		System.out.println("1000 notes -" + num1000);
		System.out.println("500 notes -" + num500);
		System.out.println("200 notes -" + num200);
		System.out.println("100 notes -" + num100);
		System.out.println("50 notes -" + num50);
		System.out.println("20 notes -" + num20);
		System.out.println("10 notes -" + num10);
		System.out.println("5 notes -" + num5);
		System.out.println("2 notes -" + num2);
		System.out.println("1 notes -" + num1);
		
		
	}
}