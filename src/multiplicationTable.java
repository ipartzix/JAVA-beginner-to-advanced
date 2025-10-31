import java.util.Scanner;
// practice qn28:-Develop a program that print a multiplication table by the user given number
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number that u want to get Multiplication Table:-  ");
        int number = input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(number+ "*"+i +"="+ (i*number));
            i++;
        }
    }
}
