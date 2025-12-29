import java.util.Scanner;
// Program to sum all odd numbers from 1 to N
class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Take user input
        int sum = oddSum(num); // Call the function
        System.out.println("Sum of all odd numbers from 1 to " + num + " is: " + sum);
        input.close();
    }
    // Function to calculate sum of odd numbers
    public static int oddSum(int num) {
        int sum = 0; // Accumulator variable
        int i = 1;   // Start counting from 1
        while (i <= num) {
            // Check if the number is odd or even
            if (i % 2 != 0) {
                sum += i; // If odd, add to sum
            } else {
                System.out.println(i + " is even, skipping...");
            }
            i++; // Move to next number
        }
        return sum; // Return total sum
    }
}