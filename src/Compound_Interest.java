import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal (P): ");
        double p = input.nextDouble();

        System.out.print("Enter the Rate of Interest (R): ");
        double r = input.nextDouble();

        System.out.print("Enter the Time (T in years): ");
        double t = input.nextDouble();

        // Amount = P * (1 + R/100)^T
        double amount = p * Math.pow((1 + r / 100), t);

        // Compound Interest = Amount - Principal
        double interest = amount - p;

        System.out.println("Compound Interest = " + interest);
        System.out.println("Total Amount = " + amount);

        input.close();
    }
}
