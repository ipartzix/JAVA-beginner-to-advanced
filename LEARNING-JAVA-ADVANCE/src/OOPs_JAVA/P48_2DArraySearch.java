package OOPs_JAVA;

import java.util.Scanner;

public class P48_2DArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to P48 2DArray Search\n");
        int [][] numArr =ArrayUtility.input2DArray();
        System.out.println("Now Enter the number You want to search :");
        int num = input.nextInt();
        boolean isFound = search( numArr , num);
        if (isFound) {
            System.out.println("number is found : ");
        }
        else {
            System.out.println("number is not found : ");
        }

    }
    public static boolean search(int [][]numArr,int num){
        int i=0;
        while (i<numArr.length){//access row
            int j=0;
                while (j<numArr[i].length){//access columns
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
