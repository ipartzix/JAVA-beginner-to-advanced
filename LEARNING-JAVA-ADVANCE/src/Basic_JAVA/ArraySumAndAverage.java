//Create a program to find  the Sum and Average of all element
public class ArraySumAndAverage
{
    public static void main(String[] args)
    {
        int[] DemoArray = {12, 44, 55, 6, 88, 32, 55, 18};
        System.out.println(DemoArray.length);
        int sum = getSum(DemoArray); // why this line also and hoe it work
        int average =getAverage(sum, DemoArray.length);
        System.out.println("The sum of this array is :" + sum);
        System.out.println("The average is : "+average);
    }

    private static int getAverage(int sum, int length) {
        int average =0;
        average= sum/length;
        return average;
    }

    public static int getSum(int[]arr )// why getSum int[] arr_
    {
        int sum = 0;
        int i = 0;
        while (i < arr.length)
        {
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }
}







/*
//Explanation
// Program: Find the Sum and Average of all elements in an array
// Author: Partha Paul (Ipartzix)
// Description: This program calculates the total sum and average of all elements
//              in a given integer array using two separate methods (getSum and getAverage).
//              Each method performs a specific task to keep the code clean and reusable.

public class ArraySumAndAverage {

    public static void main(String[] args) {

        // Step 1: Create and initialize the array
        int[] demoArray = {12, 44, 55, 6, 88, 32, 55, 18};

        // Step 2: Call the getSum() method
        // This line sends the array to the getSum() method.
        // The method calculates the total of all elements and returns it to 'sum'.
        int sum = getSum(demoArray);

        // Step 3: Call the getAverage() method
        // This line sends the total sum and number of elements (array length)
        // to the getAverage() method, which calculates and returns the average.
        int average = getAverage(sum, demoArray.length);

        // Step 4: Display the results
        System.out.println("The sum of this array is: " + sum);
        System.out.println("The average is: " + average);
    }

    // Method: getSum()
    // Purpose: To calculate the total sum of all elements in the given array.
    // Parameter: int[] arr — the array whose elements need to be added.
    // Returns: The total sum as an integer.
    public static int getSum(int[] arr) {
        int sum = 0; // initialize sum
        int i = 0;   // index variable for loop

        // Loop through the array and add each element to sum
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }

        // Return the total sum to the main method
        return sum;
    }

    // Method: getAverage()
    // Purpose: To calculate the average value of the array.
    // Parameters:
    //   int sum — total sum of all array elements (already calculated)
    //   int length — number of elements in the array
    // Returns: The average as an integer (integer division)
    public static int getAverage(int sum, int length) {
        int average = sum / length; // divide total by count
        return average;             // return result to main
    }
}
*/