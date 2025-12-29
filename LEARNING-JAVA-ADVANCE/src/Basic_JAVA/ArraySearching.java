import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array searching
        int[] arr = {12, 55, 66, 44, 77, 99, 766, 78};

        System.out.println("Enter a number to search in Array:");
        int value = input.nextInt();

        boolean isFound = isFound(arr, value);

        if (isFound) {
            System.out.println("Element is found in this Array...");
        } else {
            System.out.println("Element is NOT found in this Array...");
        }

        input.close();
    }

    public static boolean isFound(int[] arr, int value) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == value) {
                return true;
            }
            index++; // This must be inside the loop
        }
        return false; // Must return false if not found
    }
}
