// Import the Scanner class from java.util package
// This allows us to take input from the user (keyboard)
import java.util.Scanner;

// Define the public class named ReverseTheDigits
// The class name must match the file name (ReverseTheDigits.java)
public class ReverseTheDigits {

    // The main method is the entry point of every Java program
    public static void main(String[] args) {

        // Create a Scanner object called 'input' to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read the integer value entered by the user and store it in variable 'num'
        int num = input.nextInt();

        // Call the reverse() method and pass 'num' as an argument
        // The result (reversed number) will be stored in variable 'reversed'
        int reversed = reverse(num);

        // Print the reversed number on the screen
        System.out.println("Reversed number: " + reversed);

        // Close the Scanner object to free up system resources
        input.close();
    }

    // Define a static method named reverse which takes an integer 'num' as input
    // and returns an integer (the reversed number)
    public static int reverse(int num) {

        // Initialize a variable 'reverse' to 0
        // This variable will store the final reversed number
        int reverse = 0;

        // Start a while loop that runs as long as 'num' is greater than 0
        // Each iteration of the loop processes one digit of 'num'
        while (num > 0) {

            // Step 1: Extract the last digit of the number using the modulus (%) operator
            // Example: if num = 1234, then digit = 1234 % 10 = 4
            int digit = num % 10;

            // Step 2: Add this digit to the reversed number
            // Multiply 'reverse' by 10 to shift its digits left by one place
            // Then add 'digit' to form the new reversed number
            // Example: reverse = 0 * 10 + 4 = 4
            // Next iteration: reverse = 4 * 10 + 3 = 43, and so on
            reverse = reverse * 10 + digit;

            // Step 3: Remove the last digit from 'num' by performing integer division by 10
            // Example: if num = 1234, then num = 1234 / 10 = 123
            // This prepares 'num' for the next iteration of the loop
            num = num / 10;
        }

        // Step 4: After the loop ends, 'reverse' contains the reversed number
        // Return this value back to the main() method
        return reverse;
    }
}
//| Iteration | num  | digit = num % 10 | reverse = reverse * 10 + digit | new num = num / 10 |
//        | --------- | ---- | ---------------- | ------------------------------ | ------------------ |
//        | 1         | 1234 | 4                | 0 * 10 + 4 = 4                 | 123                |
//        | 2         | 123  | 3                | 4 * 10 + 3 = 43                | 12                 |
//        | 3         | 12   | 2                | 43 * 10 + 2 = 432              | 1                  |
//        | 4         | 1    | 1                | 432 * 10 + 1 = 4321            | 0                  |


//🧠 Core Concepts Used
//
//        Scanner class: for taking input
//
//        % (modulus operator): to get the last digit
//
//        / (integer division): to remove the last digit
//
//         while loop: to process all digits one by one
//
//        Multiplying by 10: to shift digits while building the reversed number