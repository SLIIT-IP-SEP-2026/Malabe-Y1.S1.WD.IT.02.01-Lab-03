import java.util.Scanner;

     public class  IT26102766Lab3Q3{
	     public static void main(String[] args){
	     Scanner input = new Scanner(System.in); 
		 
		 System.out.print("Enter the rupee amount : ");
	     int amount = input.nextInt();

		 int notes5000 = amount/5000;
		 amount = amount%5000;
		 System.out.println("5000 notes - "+notes5000);
		 
		 int notes1000 = amount/1000;
		 amount = amount%1000;
		 System.out.println("1000 notes - "+notes1000);
		 
		 int notes500 = amount/500;
		 amount = amount%500;
		 System.out.println("500 notes - "+notes500);
		 
		 int notes100 = amount/100;
		 amount = amount%100;
		 System.out.println("100 notes - "+notes100);
		 
		 int notes50 = amount/50;
		 amount = amount%50;
		 System.out.println("50 notes - "+notes50);
	 
	     int notes20 = amount/20;
		 amount = amount%20;
		 System.out.println("20 notes - "+notes20);
	 
	     int coins10 = amount/10;
		 amount = amount%10;
		 System.out.println("10 coins - "+coins10);
		 
		 int coins05 = amount/05;
		 amount = amount%05;
		 System.out.println("05 coins - "+coins05);
		 
		 int coins02 = amount/02;
		 amount = amount%02;
		 System.out.println("02 coins - "+coins02);
		 
		 int coins01 = amount/01;
		 amount = amount%01;
		 System.out.println("01 coins - "+coins01);
	 
 }
	 }