package OOPs_JAVA;
import java.util.Scanner;

// 50. Create a program to find the sum of two diagonal elements.
public class P50_TwoDiagonalSumElements {
    public static void main(String[] args) {
        System.out.println("Program to find the sum of two diagonal elements.");
        Scanner input = new Scanner(System.in);
        int [][] numArr =ArrayUtility.input2DArray();
        long sum =sumOfDiagonalElements(numArr);
        System.out.println("Sum of Diagonal is : "+ sum);

    }
    public static long sumOfDiagonalElements(int[][] numArr) {
        long leftSum = sumOf_Left_DiagonalElements(numArr);
        long rightSum = sumOf_Right_DiagonalElements(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length %2 !=0){
            int index = numArr.length/2;
            sum -=numArr[index][index];
        }
        return  sum;
    }

    public static long sumOf_Left_DiagonalElements(int[][] numArr) {
        long sum = 0;
        int i=0;
        while (i< numArr.length){
         sum += numArr[i][i];
         i++;
        }

        return  sum ;
    }

    public static long sumOf_Right_DiagonalElements(int[][] numArr) {
        long sum = 0;
        int i=0;
        while (i< numArr.length){
            int col = numArr.length -1-i;
            sum += numArr[i][col];
            i++;
        }
        return  sum;
    }
}