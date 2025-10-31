// Write a Java program to get a 3-digit number from user input and perform this operation:
// 1. Print sum of digits
// 2. Print an algebraic expression (n1 + n3 - n2)
import java.util.Scanner;
public class Sum_ArithmaticExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any 3-digit number: ");
        int num = input.nextInt();
        int originalNum = num;
        int n1 = num % 10;
        num /= 10;
        int n2 = num % 10;
        num /= 10;
        int n3 = num % 10;
        int sum = n1 + n2 + n3;
        int algebra = n1 + n3 - n2;
        System.out.println("Original number: " + originalNum);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Algebra expression (n1 + n3 - n2): " + algebra);
        input.close();
    }
}