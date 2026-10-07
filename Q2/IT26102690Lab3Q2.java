import java.util.Scanner;
public class IT26102690Lab3Q2 {
	public static void main(String[] args){
		double monthlySalary ,OThrsNumber , OThrsRate , Total , OTamount;
		
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the monthly salary :");
		monthlySalary = input.nextDouble();
		
		System.out.println("Enter the num of OT Hrs :");
		OThrsNumber = input.nextDouble();
		
		System.out.println("Enter the num of OT rate :");
		OThrsRate = input.nextDouble();
		
		OTamount = OThrsNumber * OThrsRate;
		Total = monthlySalary + OTamount;
		
		System.out.println("Total salary including OT is :" + Total);
		
		
		
		
		
		
		
		
	}
}