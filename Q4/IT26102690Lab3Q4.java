import java.util.Scanner;
public class IT26102690Lab3Q4 {
	public static void main(String[] args){
		int num,I1,I2,I3,I4,I5 ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 5 digit number :");
		num = input.nextInt();
		
		I1 = num / 10000;
		num = num % 10000;
		
		I2 = num / 1000;
		num = num % 1000;
		
		I3 = num / 100;
		num = num % 100;
		
		I4 = num / 10;
		num = num % 10;
		
		I5 = num / 1;
		num = num % 1;
		
		System.out.print(I1 + " ");
		System.out.print(I2 + " ");
		System.out.print(I3 + " ");
		System.out.print(I4 + " ");
		System.out.print(I5 + " ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}