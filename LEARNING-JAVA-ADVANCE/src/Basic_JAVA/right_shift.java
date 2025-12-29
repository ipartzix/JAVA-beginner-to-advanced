// 26. Create a program that shows use of right shift operator.

import java.util.Scanner;

public class right_shift {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println(" This is Right shift ");
        System.out.println("Please enter your number :");
        int num =input.nextInt();

        int result = num >> 1  ;
        System.out.println("Your result is :" +result);

    }
}