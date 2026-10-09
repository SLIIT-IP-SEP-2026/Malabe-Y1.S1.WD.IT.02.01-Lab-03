import java.util.Scanner;
public class IT26102683Lab3Q4{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number:");
		int digit= input.nextInt();
		
		int digit1 = digit/10000;
		int remainder1 = digit%10000;
		System.out. print(digit1+" " );
		
		int digit2 = remainder1/1000;
		int remainder2= remainder1%1000;
		System.out.print(digit2+" ");
		
		int digit3 = remainder2/100;
		int remainder3 = remainder2%100;
		System.out.print(digit3+" ");
		
		int digit4 = remainder3/10;
		int remainder4= remainder3%10;
		System.out.print(digit4+" ");
		
		int digit5 = remainder4;
		System.out.print(digit5+" ");
		
	}
}	