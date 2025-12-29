package OOPs_JAVA;

import java.util.Scanner;

public class P42_findMaxAndMin_InArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input
        System.out.println(" welcome to find Max And Min");

        // Call inputArray() from ArrayUtility class to let user enter array elements
        int [] demoArray = ArrayUtility.inputArray();

        // Find maximum value in the array using findMax method
        int max = findMax(demoArray);

        // Find minimum value in the array using findMin method
        int min = findMin(demoArray);


        // Print results
        System.out.println("MAX is :" + max);
        System.out.println("MIN is :" + min);
    }

    // Method to find maximum element in the array
    public static int findMax(int[] demoArray) {
        if (demoArray.length == 0) {
            // If array is empty, return smallest possible integer
            return Integer.MIN_VALUE;
        }

        int max = demoArray[0]; // Assume first element is max initially
        int i = 1;              // Start checking from second element

        // Loop through array
        while (i < demoArray.length) {
            if (max < demoArray[i]) {
                max = demoArray[i]; // Update max if a larger value is found
            }
            i++; // Move to next element
        }
        return max; // Return the largest value found
    }

    // Method to find minimum element in the array
    public static int findMin(int[] demoArray) {
        if (demoArray.length == 0) {
            // If array is empty, return largest possible integer
            return Integer.MAX_VALUE;
        }

        int min = demoArray[0]; // Assume first element is min initially
        int i = 0;              // Start from first element

        // Loop through array
        while (i < demoArray.length) {
            if (min > demoArray[i]) {
                min = demoArray[i]; // Update min if a smaller value is found
            }
            i++; // Move to next element
        }
        return min; // Return the smallest value found
    }
}