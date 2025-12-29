import java.util.Scanner;
// Write a java program to print Fibonacci Series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your 'N'th number :");
        int num = input.nextInt();
        int first =0;
        int second =1;
        int count =0;
        System.out.println("The 1st and 2nd Fibonacci Series are  "+first +"  &  "+second);
        while(count < num) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
        input.close();
   }
}