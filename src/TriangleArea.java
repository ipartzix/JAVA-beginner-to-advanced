//Create a program to calculate the Area of a Triangle.
//Area of triangle = ½*B*H
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input base and height
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        // Formula: (1/2) * base * height
        double area = 0.5 * base * height;
        // Output result
        System.out.println("Area of the Triangle = " + area);
        input.close();
//        input.close(); is used to free memory and system resources.
//        It’s not mandatory in small programs, but it’s good practice in professional coding.
    }
}
