import java.util.Scanner;

public class IT26102779Lab3Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number, int1, int2, int3, int4, int5;
		System.out.println("Enter a five digit number: ");
		number = input.nextInt();
		
		int1 = number/10000;
		int2 = (number/1000) %10;
		int3 = (number/100) %10;
		int4 = (number/10) %10;
		int5 = (number/1) %10;
		
		System.out.println(int1 + " " + int2 +" " + int3 + " " + int4 + " " + int5 );

	}
	
	
}
