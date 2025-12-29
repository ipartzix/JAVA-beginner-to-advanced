package Basic_JAVA;

import java.util.Scanner;
//import java.util.Scanner;
//public class add_number {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 1st number :");
//        int num1=input.nextInt();
//        System.out.println("Enter 2nd number :");
//        int num2=input.nextInt();
//        int sum=num1+num2; `
//        System.out.println("the sum of two number is "+sum);
//    }
//}
public  class AddNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        input.close();
    }
}