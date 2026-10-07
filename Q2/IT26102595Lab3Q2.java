import java.util.Scanner;
   public class IT26102595Lab3Q2{
    public static void main(String[] args){
            

       Scanner input = new Scanner(System.in);	
        System.out.print("Enter the monthly salary:");
           double monthlysalary = input.nextDouble();
		    
	    System.out.print("Enter the  number of OT hours:");
		   int OThours = input.nextInt();
		   
		System.out.print("Enter the OT hourly Rate:");
		   double OTrate = input.nextDouble();
             
        double otAmount = OThours * OTrate;
		double totalsalary = monthlysalary + otAmount;

    System.out.println("/nthe total salary including OT is:" + totalsalary);		   
	  
 }
   }
 