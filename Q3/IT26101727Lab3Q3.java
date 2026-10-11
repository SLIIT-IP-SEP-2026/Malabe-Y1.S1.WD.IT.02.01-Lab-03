import java.util.Scanner;

public class IT26101727Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount;
        int count;

        System.out.print("Enter the rupee amount: ");
        amount = input.nextInt();

        count = amount / 5000;
        System.out.println("5000 Notes - " + count);
        amount = amount % 5000;

        count = amount / 1000;
        System.out.println("1000 Notes - " + count);
        amount = amount % 1000;

        count = amount / 500;
        System.out.println("500 Notes - " + count);
        amount = amount % 500;

        count = amount / 200;
        System.out.println("200 Notes - " + count);
        amount = amount % 200;

        count = amount / 100;
        System.out.println("100 Notes - " + count);
        amount = amount % 100;

        count = amount / 50;
        System.out.println("50 Notes - " + count);
        amount = amount % 50;

        count = amount / 20;
        System.out.println("20 Notes - " + count);
        amount = amount % 20;

        count = amount / 10;
        System.out.println("10 Notes - " + count);
        amount = amount % 10;

        count = amount / 5;
        System.out.println("05 Notes - " + count);
        amount = amount % 5;

        count = amount / 2;
        System.out.println("02 Coins - " + count);
        amount = amount % 2;

        count = amount / 1;
        System.out.println("01 Coins - " + count);

        input.close();
    }
}
