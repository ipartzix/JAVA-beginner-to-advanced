import java.util.Scanner;

public class arithmeticOperatorsInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// always implement scanner module/packages atr the beginning
        int sum, sub,multi,div,mod;
        System.out.println("Enter a number for A :  ");
        int numA= input.nextInt();
        System.out.println("Enter a number for B :  ");
        int numB= input.nextInt();
        sum=numA+numB;
        sub=numA-numB;
        multi=numA*numB;
        div=numA/numB;
        mod=numA%numB;
        System.out.println("The sum of "+numA+" and "+numB+" is : "+sum);
        System.out.println("The sub  of "+numA+" and "+numB+" is : "+sub);
        System.out.println("The  multi "+numA+" and "+numB+" is : "+multi);
        System.out.println("The  div "+numA+" and "+numB+" is : "+div);
        System.out.println("The  mod "+numA+" and "+numB+" is : "+mod);
        System.out.println("Thank you from IPARTZIX");
    }
}

// the optimized and more professional code is

// import java.util.Scanner;
//
//public class ArithmeticOperatorsInJava {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in); // Scanner for user input
//
//        System.out.print("Enter a number for A: ");
//        int numberA = input.nextInt();
//
//        System.out.print("Enter a number for B: ");
//        int numberB = input.nextInt();
//
//        int sum = numberA + numberB;
//        int difference = numberA - numberB;
//        int product = numberA * numberB;
//
//        // Handle division and modulus safely
//        String divisionResult = (numberB != 0) ? String.valueOf(numberA / numberB) : "Undefined (division by zero)";
//        String modulusResult  = (numberB != 0) ? String.valueOf(numberA % numberB) : "Undefined (division by zero)";
//
//        System.out.println("\nResults:");
//        System.out.printf("Sum of %d and %d = %d%n", numberA, numberB, sum);
//        System.out.printf("Difference of %d and %d = %d%n", numberA, numberB, difference);
//        System.out.printf("Product of %d and %d = %d%n", numberA, numberB, product);
//        System.out.printf("Division of %d and %d = %s%n", numberA, numberB, divisionResult);
//        System.out.printf("Modulus of %d and %d = %s%n", numberA, numberB, modulusResult);
//
//        System.out.println("\nThank you! — IPARTZIX");
//
//        input.close();
//    }
//}