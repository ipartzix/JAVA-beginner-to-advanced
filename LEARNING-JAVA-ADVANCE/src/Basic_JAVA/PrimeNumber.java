import java.util.Scanner;
// Write a program to check if a number is prime or not
public class PrimeNumber {
    public static void main(String[] args) { // ✅ Must have String[] args

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter a number to check if it's prime: ");
        int num = input.nextInt();

        System.out.println("You have entered: " + num);

        boolean isPrime = isPrime(num); // ✅ Remove extra '=' and fix method name

        if (isPrime) {
            System.out.println("Your number is prime!");
        } else {
            System.out.println("Not a prime number!");
        }

        input.close(); // ✅ Always close scanner
    }
    // ✅ Define this method *outside* main, not inside
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false; // Found a divisor
            }
            i++;
        }
        return true; // No divisors found → prime
    }
}



//import java.util.Scanner;
// // write a program to check number is prime or not
//public class PrimeNumber {
//    public static void main() {
//        Scanner input =new Scanner(System.in);
//        System.out.println("Welcome to Prime Number ");
//        System.out.println("Enter a number to check prome or not :-");
//        int num= input.nextInt();
//        System.out.println("You have enter :"+num);
//        boolean isprime = =isprime(num);
//        if (isprime){
//            System.out.println("your number is prime !!");
//        }
//        else {
//            System.out.println("|not prime!!!");
//        }
//        public static boolean isprime(int num){
//            int i=2;
//            while (i<num){
//                if (num %i ==0){
//                    return false;
//                }
//                i++;
//            }
//            return true;
//        }
//    }
//}
//

