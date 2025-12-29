import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        Scanner input =new Scanner(System.in);
        String user_name = input.nextLine();
        System.out.println("Good Morning "+ user_name);
        System.out.println(user_name +" ,also tell me your age");
        int  age= input.nextInt();
        System.out.println("Your age is " +  age );
    }
}