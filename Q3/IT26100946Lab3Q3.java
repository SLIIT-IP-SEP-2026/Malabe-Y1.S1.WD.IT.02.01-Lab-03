import java.util.Scanner;

public class IT26100946Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int denom : denominations) {
            int count = amount / denom;
            amount = amount % denom;
            String denomStr = (denom < 10) ? "0" + denom : String.valueOf(denom);

            System.out.println(denomStr + " Notes - " + count);
        }

        scanner.close();
    }
}