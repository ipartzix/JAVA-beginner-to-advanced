import java.util.Scanner;
public class function_in_java {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        greeting();
        selection();
        int num= input.nextInt();
        System.out.println("So you have select :"+num);
        switch (num){
            case 1:
                pattern_a();
                break;
            case 2:
                pattern_b();
                break;
            case 3:
                pattern_c();
                break;
            case 4:
                pattern_d();
                break;
            default:
                System.out.println("wrong input ");
        }
    }
    public static void greeting () {
        System.out.println("Good morning from Ipartzix ");
    }
    public static void selection(){
        System.out.println("Enter any one  from(a+1,b=2,c=3,d=4) for printing  pattern ! ");
    }
    public static void pattern_a(){
        System.out.println("This is pattern a");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");




    }
    public static void pattern_b(){
        System.out.println("    *");
        System.out.println("   **");
        System.out.println("  ***");
        System.out.println(" ****");
        System.out.println("*****");
    }
    public static void pattern_c(){
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
    }
    public static void pattern_d(){
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println("   ***");
        System.out.println("    *");
    }
}