import java.util.Scanner;

public class IT26102573Lab3Q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int amount,number1,number2,number3,number4,number5,number6,number7,number8,number9,number10,number11;

        System.out.print("Enter the Rupee amount: ");
         amount = input.nextInt();
        
         number1 = amount / 5000;
        amount = amount % 5000;
        
        number2 = amount / 1000;
        amount = amount % 1000;
        
        number3 = amount / 500;
        amount = amount % 500;
        
        number4 = amount / 200;
        amount = amount % 200;
        
        number5 = amount / 100;
        amount = amount % 100;
        
        number6= amount / 50;
        amount = amount % 50;
        
        number7 = amount / 20;
        amount = amount % 20;
        
        number8 = amount / 10;
        amount = amount % 10;
        
        number9 = amount / 5;
        amount = amount % 5;
        
        number10 = amount / 2;
        amount = amount % 2;
        
        number11 = amount / 1;
        

        System.out.println("5000 Notes - " + number1);
        System.out.println("1000 Notes - " + number2);
        System.out.println("500 Notes - " + number3);
        System.out.println("200 Notes - " + number4);
        System.out.println("100 Notes - " + number5);
        System.out.println("50 Notes - " + number6);
        System.out.println("20 Notes - " +number7);
        System.out.println("10 Notes - " + number8);
        System.out.println("05 Notes - " + number9);
        System.out.println("02 Notes - " + number10);
        System.out.println("01 Notes - " + number11);
        
    
    }
}