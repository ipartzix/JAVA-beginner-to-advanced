// reate a program to calculate simple interest. Simple Interest = (P x T x R)/100
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input principal, time and rate
        System.out.print("Enter Principal (P): ");
        double P = input.nextDouble();
        System.out.print("Enter Time in years (T): ");
        double T = input.nextDouble();
        System.out.print("Enter Rate of Interest (R): ");
        double R = input.nextDouble();
        // Formula: (P x T x R) / 100
        double SI = (P * T * R) / 100;
        // Output
        System.out.println("Simple Interest = " + SI);

        input.close();
    }
}
