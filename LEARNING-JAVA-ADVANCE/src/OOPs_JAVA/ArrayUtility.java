package OOPs_JAVA;
/* base class with 1D Array and 2D Array Input with Display feature */
import java.util.Scanner;
public class ArrayUtility {
    public static int [] inputArray() {
        Scanner input = new Scanner(System.in);   // Step 1: Create a Scanner to read user input
        System.out.print("Please enter the number of elements :- ");
        int size = input.nextInt();// Step 2: Ask user for array size
        int [] num = new int[size];// Step 3: Create an integer array of that size
        int i = 0;
        while (i < size)// Step 4: Loop until all elements are filled
        {
            System.out.println("Please enter element number -" + (i+1) + ":");
            num[i] = input.nextInt();// Step 5: Read each element from user
            i++;
        }
        return num;// Step 6: Return the filled array
    }
    public static void displayArray(int[] numArray){
        int i =0;
        while (i< numArray.length){
            System.out.println(numArray[i]+" ");
            i++;
        }
        System.out.println(" ");
    }
    public static int [] [] input2DArray() {
        Scanner input = new Scanner(System.in);   // Step 1: Create a Scanner to read user input
        System.out.print("Please enter the number of rows :- ");
        int rows = input.nextInt();
        // Step 2: Ask user for array size

        System.out.print("Please enter the number of Columns  :- ");
        int columns = input.nextInt();

        int [][] numArray = new int[rows][columns];// Step 3: Create an integer array of that size


        int i = 0;
        while (i < rows)// Step 4: Loop until all elements are filled
        {
            int j=0;
            while (j<columns){
                System.out.println("Please enter element rows : -"
                        + (i+1) + ", Columns : -" + (j+1) +":");
                numArray[i][j] = input.nextInt();
                j++;
            }

            // Step 5: Read each element from user
            i++;
        }
        return numArray;// Step 6: Return the filled array
    }
}