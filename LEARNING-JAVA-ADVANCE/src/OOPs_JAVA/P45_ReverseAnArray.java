package OOPs_JAVA;
import java.util.Scanner;
//q45.> Create a program to reverse an array
public class P45_ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversing");
        Scanner input = new Scanner(System.in);
        int [] baseArr =ArrayUtility.inputArray();
        reverseArray(baseArr);
        //You are calling the method reverseArray and
        //  passing the array baseArr to it so that the method can modify that array.
        System.out.println("the reverse array is: ");
        ArrayUtility.displayArray(baseArr);

    }
    public static void reverseArray(int[] arr){
        int i=0;
        while(i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
}
