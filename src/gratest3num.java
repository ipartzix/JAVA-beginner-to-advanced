//Create a program that determines the greatest of the three
//numbers

import java.util.Scanner;

public class gratest3num {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st number :-");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number :-");
        int num2 = input.nextInt();

        System.out.println("Enter 3rd number :-");
        int num3 = input.nextInt();

        if (num1 > num2 && num1> num3){
            System.out.println("num 1 is greatest");
        }
        else if (num2 > num1 && num2> num3){
            System.out.println("2nd is greatest");
        }
        else {
            System.out.println(" 3rd is greatest");
        }
    }
}
