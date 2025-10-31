import java.util.Scanner;

public class even_odd_bitwise {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to check EVEN or ODD : ");
        int num = input.nextInt();

        if ((num  &1 ) ==1){
            System.out.println("Your number is ODD");
        }
        else {
            System.out.println("number is EVEN");

        }
    }
}