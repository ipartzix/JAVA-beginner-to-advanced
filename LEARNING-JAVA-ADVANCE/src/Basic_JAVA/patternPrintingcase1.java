import java.util.Scanner;

public class patternPrintingcase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stars per row (column number): ");
        int columnNumber = input.nextInt();

        int i = 1; // outer loop counter
        while (i <= columnNumber) {       // outer loop for rows
            int j = 1;                    // inner loop counter (reset every row)
            while (j <= columnNumber) {   // inner loop for columns
                System.out.print("* ");    // print stars in the same line
                j++;
            }
            System.out.println();          // move to the next line
            i++;
        }
    }
}
