import java.util.Scanner;
//Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9
public class F_to_C {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temprature in Fahrenheit :");
        double Fa= input.nextDouble();
        double cel =(Fa - 32)*(5.0/9);
//        In Java, 5/9 is treated as integer division, not floating-point division.
//        5/9 = 0 (since both are integers).
//        So your formula becomes (Fa - 32) * 0 = 0
//        Make sure at least one of the numbers is a double (like 5.0/9 or 5/9.0):
        System.out.println("the Temprature in Celsius is : "+cel);
        input.close();
    }
}
