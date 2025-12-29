package OOPs_JAVA;
//write a program to delete an element in an Array and give a new array
import java.util.Scanner;

public class P44_DeletedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Deletion");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter a number that you want to delete !!!");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here the deleted array is :  ");
        ArrayUtility.displayArray(newArr);
    }


    public static int[] deleteNumber(int[] numArr, int numToDelete) {

        int occ = P41_OccurrencesNumber_in_ARRAY.noOfOccurrences(numArr, numToDelete);

        if (occ == 0) {
            System.out.println("Number not found.");
            return numArr;
        }

        int[] newArr = new int[numArr.length - occ];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }

}
