import java.util.Scanner;

public class IT26102598Lab3Q3 {
	
	public static void main(String[] args) {
		
		int count5000 = 0;
		int count1000 = 0;
		int count500 = 0;
		int count200 = 0;
		int count100 = 0;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount: ");
		int amount = input.nextInt();
		
		count5000 = amount / 5000;
		int notes = amount % 5000;
		
		count1000 = amount / 1000;
		notes = amount % 1000;
		
		count500 = amount / 500;
		notes = amount % 500;
		
		count200 = amount / 200;
		notes = amount % 200;
		
		count100 = amount / 100;
		notes = amount % 100;
		
		count50 = amount / 50;
		notes = amount % 50;
		
		count20 = amount / 20;
		notes = amount % 20;
		
		count10 = amount / 10;
		notes = amount % 10;
		
		count5 = amount / 5;
		notes = amount % 5;
		
		count2 = amount / 2;
		notes = amount % 2;
		
		count1 = amount / 1;
		notes = amount % 1;
		
		System.out.println();
		System.out.println("5000 Notes - " + count5000);
		System.out.println("1000 Notes - " + count1000);
		System.out.println("500 Notes - " + count500);
		System.out.println("200 Notes - " + count200);
		System.out.println("100 Notes - " + count100);
		System.out.println("50 Notes - " + count50);
		System.out.println("20 Notes - " + count20);
		System.out.println("10 Notes - " + count10);
		System.out.println("5 coins - " + count5);
		System.out.println("2 coins - " + count2);
		System.out.println("1 coins - " + count1);
		
	}
}
