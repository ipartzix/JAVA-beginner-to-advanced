//Create a program that determines if a number is odd or even.
//number % 2 == 0 → Even number (no remainder)/number % 2 != 0 → Odd number (remainder is 1)
import java.util.Scanner;

public class odd_even_checker {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if (number %2 ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
