import java.util.Scanner; // Importing Scanner class for user input

public class ArmstrongNumber {
    // Main method – entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter number: ");     // Ask the user for a number
        int num = input.nextInt();              // Read the integer input
        // Call the isArmstrong() method to check if the number is Armstrong
        boolean isArmstrong = isArmstrong(num);
        // Print the result based on the boolean value
        if (isArmstrong) {
            System.out.println("Your number is an Armstrong number.");
        } else {
            System.out.println("Your number is not an Armstrong number.");
        }
    }
    // Method to check whether a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;                 // Store the original number for comparison later
        int digits = numberOfDigits(num);   // Count total digits in the number
        int finalNumber = 0;                // Variable to store the sum of powered digits
        // Loop through each digit of the number
        while (num > 0) {
            int digit = num % 10;           // Extract the last digit
            num /= 10;                      // Remove the last digit from the number
            finalNumber += pow(digit, digits); // Add the digit raised to 'digits' power
        }
        // Return true if the sum of powered digits equals the original number
        return finalNumber == original;
    }
    // Method to calculate the power of a number manually (num1 ^ num2)
    public static int pow(int num1, int num2) {
        int result = 1; // Initialize result as 1 (since anything raised to 0 is 1)
        int i = 0;      // Counter variable
        while (i < num2) {  // Repeat num2 times
            result *= num1; // Multiply result by num1 each time
            i++;            // Increment counter
        }
        return result;      // Return the final result
    }
    // Method to count the number of digits in the number
    public static int numberOfDigits(int num) {
        int digits = 0;  // Counter for digits
        while (num > 0) { // Repeat until the number becomes 0
            digits++;     // Increment count for each digit
            num /= 10;    // Remove the last digit
        }
        return digits;    // Return total digits count
    }
}