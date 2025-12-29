public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("2nd line");
        // Sum, Subtraction, Multiplication, Division
        {
            int a = 10;
            int b = 20;
            int sum = a + b;
            int difference = b - a;
            int product = a * b;
            int division = b / a;
            System.out.println("________________________________________");
            System.out.println("The sum of " + a + " and " + b + " is " + sum);
            System.out.println("________________________________________");
            System.out.println("The difference between " + b + " and " + a + " is " + difference);
            System.out.println("________________________________________");
            System.out.println("The product of " + a + " and " + b + " is " + product);
            System.out.println("________________________________________");
            System.out.println("The quotient of " + b + " divided by " + a + " is " + division);
            System.out.println("________________________________________");
            System.out.println("Thank you");
        }
        // Circle: Area and Circumference
        {
            int r = 10;
            float area = 3.14f * r * r;
            float circumference = 2 * 3.14f * r;

            System.out.println("____________________________________________");
            System.out.println("The area of the circle (radius " + r + ") is " + area);
            System.out.println("____________________________________________");
            System.out.println("The circumference of the circle (radius " + r + ") is " + circumference);
        }
        // Rectangle: Area and Perimeter
        {
            int length = 10;

            int width = 12;
            int area = length * width;
            int perimeter = 2 * (length + width);
            System.out.println("__________________________________________");
            System.out.println("The area of the rectangle is " + area);
            System.out.println("__________________________________________");
            System.out.println("The perimeter of the rectangle is " + perimeter);
            System.out.println("__________________________________________");
        }
    }
}

