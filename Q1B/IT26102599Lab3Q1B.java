import java.util.Scanner;

public  class IT26102599Lab3Q1B
{public static void main (String[] args)
{
double Total,ammount,discount;
Scanner input=new Scanner(System.in);

System.out.print("ammount:");
ammount = input.nextDouble();

discount=ammount/10;

System.out.println("discount:" + discount );

Total=ammount-discount;

System.out.print("Total:"+ Total);

} 
}