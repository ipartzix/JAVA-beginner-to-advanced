import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int sum = 0;

        // Handle negative numbers by converting to positive
        num = Math.abs(num);

        while (num > 0) {
            digit = num % 10; // Get the last digit
            sum += digit; // Add it to the sum
            num /= 10; // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
        input.close(); // Close the scanner
    }
}