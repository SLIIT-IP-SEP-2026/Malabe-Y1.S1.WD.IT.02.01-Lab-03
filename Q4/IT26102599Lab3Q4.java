
import java.util.Scanner;

public class IT26102599Lab3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, a, b, c, d, e;

        System.out.print("Enter a five-digit number: ");
        number = input.nextInt();

        a = number / 10000;
        b = (number / 1000) % 10;
        c = (number / 100) % 10;
        d = (number / 10) % 10;
        e = number % 10;

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        input.close();
    }
}
