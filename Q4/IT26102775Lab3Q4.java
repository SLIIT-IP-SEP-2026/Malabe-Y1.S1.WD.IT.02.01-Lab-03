import java.util.Scanner;
public class IT26102775Lab3Q4{
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  // Getting the user input 
  System.out.println("Enter a five digit number :");
  int digit = input.nextInt();
  
  int Num1 = digit/10000;
  digit = digit%10000;
  int Num2 = digit/1000;
  digit = digit%1000;
  digit = digit%1000;
  int Num3 = digit/100;
  digit = digit%100;
  int Num4 = digit/10;
  digit = digit%10;
  int Num5 = digit/1;
  digit = digit%1;
  
  System.out.println(Num1 + " " + Num2 + " " + Num3 + " " + Num4 + " " + Num5); 
 }
}