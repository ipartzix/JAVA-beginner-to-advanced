// // write a program to find  the Greatest Common Divisor (GCD) of two numbers
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the GCD Program:");
        System.out.print("Enter 1st number: ");
        int first = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = input.nextInt();
        int gcd = findGCD(first, second);
        System.out.println("The GCD of " + first + " and " + second + " is: " + gcd);
    }
    // Euclidean algorithm to find GCD
    public static int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Ensures GCD is always positive
    }
}
