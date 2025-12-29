// 25. Create a program that shows use of left shift operator.


import java.util.Scanner;

public class left_shift {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" This is left shift ");
        System.out.println("Please enter your number :");
        int num =input.nextInt();

        int result = num << 1  ;
        System.out.println("Your result is :" +result);

    }
}
