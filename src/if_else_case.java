import java.util.Scanner;

public class if_else_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:-");
        int age=input.nextInt();
        if (age<=18) {
            System.out.println("You are not able to drive !");
        }
        else if (age > 18 && age < 60) {
            System.out.println("perfect form driving n");
        }
        else {
            System.out.println("u can drive");
        }
        input.close();
    }
}