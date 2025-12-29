import java.util.Scanner;

public class NameT1 {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String user_name = input.nextLine();
        System.out.println("Welcome " + user_name + " to Google");
        input.close();
    }
}
