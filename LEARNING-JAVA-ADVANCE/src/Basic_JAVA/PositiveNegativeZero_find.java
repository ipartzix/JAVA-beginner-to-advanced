//.Create a program that determines if a number is positive, negative,
//or zero.

import java.util.Scanner;

public class PositiveNegativeZero_find {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if(number == 0) {
            System.out.println("The number u have enter was Zero");
        }
        else if ( number > 0) {
            System.out.println("number is positive");
        }
        else {
            System.out.println("negative num");
        }
    }
}
