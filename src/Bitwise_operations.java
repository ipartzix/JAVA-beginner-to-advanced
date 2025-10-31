import java.util.Scanner;
public class Bitwise_operations {
    //and (&)
    public static void main(String[] args) {

//        Scanner input =new Scanner(System.in);
//        System.out.println("Show the bit wise AND operation");
//        System.out.println("Enter the 1st number :");
//        int number1 = input.nextInt();
//        System.out.println("Enter the 2nd  number :");
//        int number2 = input.nextInt();
//        int result = number1 & number2 ;
//        System.out.println("Result is : "+result);





//        Scanner input =new Scanner(System.in);
//        System.out.println("Show the bit wise or operation");
//        System.out.println("Enter the 1st number :");
//        int number1 = input.nextInt();
//        System.out.println("Enter the 2nd  number :");
//        int number2 = input.nextInt();
//        int result = number1 | number2 ;
//        System.out.println("Result is : "+result);






//        Scanner input =new Scanner(System.in);
//        System.out.println("Show the bit wise XOR operation");
//        System.out.println("Enter the 1st number :");
//        int number1 = input.nextInt();
//        System.out.println("Enter the 2nd  number :");
//        int number2 = input.nextInt();
//        int result = number1 ^ number2 ;
//        System.out.println("Result is : "+result);





        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("The result after applying bitwise NOT is: " + result);

    }
}