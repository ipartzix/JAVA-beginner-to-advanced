import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int numberOne=input.nextInt();
        System.out.println("Enter 2nd number :");
        int numberTwo =input.nextInt();

        int add =(numberOne + numberTwo);
        int sub =(numberOne - numberTwo);
        int multi=(numberOne * numberTwo);
        int div=(numberOne / numberTwo);

        System.out.println("The add of " +numberOne +"and "+numberTwo+ "is :"+add);
        System.out.println("The sub  of " +numberOne +"and "+numberTwo+ "is :"+sub);
        System.out.println("The multi of " +numberOne +"and "+numberTwo+ "is :"+multi);
        System.out.println("The div of " +numberOne +"and "+numberTwo+ "is :"+div);

    }
}
