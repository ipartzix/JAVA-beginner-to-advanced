import java.util.Scanner;

public class palindromeNumber {
   public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("Enter a number to check palindrome : ");
       int num = input.nextInt();
       boolean isPalindrome = isPalindrome(num);
       if(isPalindrome){
           System.out.println("it is a palindrome number ");
       }
       else {
           System.out.println("it is  not a palindrome number ");

       }
   }

   public static boolean isPalindrome(int num){
       int original = num;
       int reverse =0;

       int i=0;
       while(num > 0){
           int digit = num % 10;
           reverse= reverse * 10 +digit; // Extract the last digit
           num /= 10;
       }
        return  reverse== original ;

   }
}
