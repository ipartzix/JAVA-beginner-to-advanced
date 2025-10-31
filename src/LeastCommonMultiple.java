//import java.util.Scanner;
//public class LeastCommonMultiple {
//    // Method to calculate GCD using Euclidean algorithm
//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//    // Method to calculate LCM
//    public static int lcm(int a, int b) {
//        return (a * b) / gcd(a, b);
//    }
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the 1st number:-");
//        int num1 = input.nextInt();
//        System.out.println("Enter the 2nd number:-");
//        int num2 = input.nextInt();
//        int result = lcm(num1, num2);
//        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
//    }
//}
// write a program to find  the least Common Multiplication (LCM) of two numbers
import java.util.Scanner;
class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int first = input.nextInt();

        System.out.println("Enter the 2nd number:");
        int second = input.nextInt();int result = findLCM(first, second);
        System.out.println("LCM of both numbers is: " + result);
    }
    public static int findLCM(int first, int second) {
        int i = 1;
        while (true) { //
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}