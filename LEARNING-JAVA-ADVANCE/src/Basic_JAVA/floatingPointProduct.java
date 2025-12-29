import java.util.Scanner;

public class floatingPointProduct
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st float value :");
        float num1 = input.nextFloat();
        System.out.println("Enter 2nd float value :");
        float num2 = input.nextFloat();

        float product = num1*num2;
        System.out.println("The product is :"+product);
    }
}
