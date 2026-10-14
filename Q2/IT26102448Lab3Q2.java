import java.util.Scanner;
	public class IT26102448Lab3Q2{
		public static void main (String[] args){
		double OTamount,Total,OThours,OThourlyrate,Monthlysalary;
		
		Scanner Input=new Scanner(System.in);
		System.out.print("Enter the monthly salary:");
		
		Monthlysalary = Input.nextDouble();
		
		System.out.print("Enter the number of OT hours:");
		OThours = Input.nextDouble();
		
		System.out.print("Enter the OT hourly Rate:");
		OThourlyrate =Input.nextDouble();
		
		OTamount=OThourlyrate*OThours;
		
		Total=Monthlysalary+OTamount;
		
		System.out.print("The total salary including OT is:" +Total);
		}
			
}