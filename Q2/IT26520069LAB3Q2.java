
import java.util.Scanner;

public class IT26520069LAB3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = 50000;
        double otRate = 500;
        double otHours, otAmount, totalSalary;

        System.out.print("Enter OT hours: ");
        otHours = input.nextDouble();

        otAmount = otHours * otRate;
        totalSalary = salary + otAmount;

        System.out.println("Monthly Salary = " + salary);
        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}

    

