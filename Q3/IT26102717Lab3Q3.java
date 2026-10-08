import java.util.Scanner;
public class IT26102717Lab3Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount :");
		int number = input.nextInt();
		
		System.out.print("5000 Notes - ");
		System.out.println(number / 5000);
		
		int remainder1 = number % 5000 ;
		
		System.out.print("1000 Notes - ");
		System.out.println(remainder1 / 1000);
		
		int remainder2 = remainder1 % 1000 ;
		
		System.out.print("500 Notes - ");
		System.out.println(remainder2 / 500);
		
		int remainder3 = remainder2 % 500 ;
		
		System.out.print("200 Notes - ");
		System.out.println(remainder3 / 200);
		
		int remainder4 = remainder3 % 200 ;
		
		System.out.print("100 Notes - ");
		System.out.println(remainder4 / 100);
		
		int remainder5 = remainder4 % 100;
		
		System.out.print("50 Notes - ");
		System.out.println(remainder5 / 50);
		
		int remainder6 = remainder5 % 50 ;
		
		System.out.print("20 Notes - ");
		System.out.println(remainder6 / 20);
		
		int remainder7 = remainder6 % 20;
		
		System.out.print("10 Notes - ");
		System.out.println(remainder7 / 10);
		
		int remainder8 =  remainder7 % 10;
		
		System.out.print("05 Notes - ");
		System.out.println(remainder8 / 5);
		
		int remainder9 =  remainder8 % 5;
		
		System.out.print("02 Notes - ");
		System.out.println(remainder9 / 2);
		
		int remainder10 =  remainder9 % 2;
		
		System.out.print("01 Notes - ");
		System.out.println(remainder10 / 1);
		
		
		
		
		
	}
}