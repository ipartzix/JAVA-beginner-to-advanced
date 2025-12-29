import java.util.Scanner;
public class FactorialCounting {
    //write a program to calculate the factorial of a program
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number to calculate Factorial :-");
        int num = input.nextInt();
        int fact = 1;   // Step 1: Initialize 'fact' as 1 — acts as an accumulator to store the running factorial result.
// We start with 1 because multiplication with 0 would make the result 0 (and factorial starts from 1).
        int i = 1;      // Step 2: Initialize loop counter 'i' as 1 — factorial is calculated from 1 up to the given number.
        while (i <= num) {  // Step 3: Loop continues as long as i is less than or equal to the input number.
            fact = fact * i; // Step 4: Multiply the current value of 'fact' by 'i' to build the factorial progressively.
            // Example: if num = 5 → 1×1, 1×2, 2×3, 6×4, 24×5 → result = 120
            i++;              // Step 5: Increment 'i' by 1 to move to the next number in the sequence.
        }                     // Step 6: Once 'i' exceeds 'num', the loop ends and 'fact' holds the final factorial value.
        System.out.println("the factorial is :"+fact);
    }
}
