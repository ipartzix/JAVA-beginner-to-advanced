import java.util.Scanner;

public class Learn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create an empty 2D array
        int[][] numbers = new int[2][3];  // 2 rows, 3 columns
//           *  *  *
//           *  *  *

        // Step 2: Ask the user to enter values
        System.out.println("Enter 6 numbers (2 rows × 3 columns):");

        for (int i = 0; i < 2; i++) {          // loop for rows
            for (int j = 0; j < 3; j++) {      // loop for columns
                numbers[i][j] = input.nextInt(); // take input from user
            }
        }

        // Step 3: Print the array
        System.out.println("Here is your 2D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // go to next line after each row
        }
    }
}
