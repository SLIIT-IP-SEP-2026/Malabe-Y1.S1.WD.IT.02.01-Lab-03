import java.util.Scanner;
public class IT26102683Lab3Q3{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the Ruppe amount = ");
		int amount= input.nextInt();
		
		System.out.println("5000 Notes-" +amount/5000);
		int remainder1 = amount%5000;
		
		System.out.println("1000 Notes-" +remainder1/1000);
		int remainder2 = remainder1%1000;
		
		System.out.println("500 Notes-" +remainder2/500);
		int remainder3 = remainder2%500;
		
		System.out.println("200 Notes-" +remainder3/200);
		int remainder4 = remainder3%200;
		
		System.out.println ("100 Notes-" +remainder4/100);
		int remainder5 = remainder4%100;
		
		System.out.println("50 Notes-" +remainder5/50);
		int remainder6 = remainder5%50;
		
		System.out.println("20 Notes-" +remainder6/20);
		int remainder7 = remainder6%20;
		
		System.out.println("10 Notes-" +remainder7/10);
		int remainder8 = remainder7%10;
		
		System.out.println("5 Coins-" +remainder8/5);
		int remainder9 = remainder8%5;
		
		System.out.println("2 Coins-" +remainder9/2);
		int remainder10 = remainder9%2;
		
		System.out.println("1 Coins-" +remainder10/1);
		int remainder11 = remainder10;
		
		
		
		
	}
}	