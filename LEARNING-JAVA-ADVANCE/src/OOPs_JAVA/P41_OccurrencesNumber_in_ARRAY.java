package OOPs_JAVA;
// write a program to find number of occurrence of an  element in an Array
import java.util.Scanner;
public class P41_OccurrencesNumber_in_ARRAY
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to P41 Occurrences Number");
        int [] demoArray = ArrayUtility.inputArray();
        System.out.println("Enter the number of  elements you want find in the array: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences( demoArray, num);
        System.out.println("Your element was found "+occurrences +" time in the array");
    }
    public static int noOfOccurrences(int[] numArr , int num)
    {
        int occ = 0;   // Step 1: Initialize a counter to 0
        int i = 0;     // Step 2: Start index at 0
        // Step 3: Loop through the array until the end
        while (i < numArr.length) {
            // Step 4: Check if the current element matches 'num'
            if (numArr[i] == num) {
                occ++;  // Step 5: If match found, increase counter
            }
            i++;  // Step 6: Move to the next index
        }
        // Step 7: Return the total count
        return occ;
    }

}