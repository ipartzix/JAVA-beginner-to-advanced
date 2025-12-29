import java.util.Scanner;
public class array_learn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] demo = new int[5];
        demo[0] = 44;
        demo[1] = 34;
        demo[2] = 64;
        demo[3] = 94;
        demo[4] = 74;
        int index  = 0;

        // Array Traversal

        while (index < demo.length) {
            System.out.println(demo[index]);
            index++;
        }
        input.close();
    }
}// A class to demonstrate the basics of arrays in Java
class ArrayExample {

    public static void main(String[] args) {

        System.out.println("--- Method 1: Declare, Create, and Assign ---");

        // 1. Declare an array of integers
        // This just tells Java the variable 'numbers' will hold an array of ints.
        int[] numbers;

        // 2. Create the array in memory
        // We need to specify the size. Let's make an array to hold 5 integers.
        // The 'new' keyword is used to create the object.
        numbers = new int[5];

        // 3. Assign values to each element in the array
        // Array indexes start at 0. So, a 5-element array has indexes 0, 1, 2, 3, and 4.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // Be careful! Accessing numbers[5] would cause an 'ArrayIndexOutOfBoundsException'

        // Access and print a single element
        System.out.println("The element at index 2 is: " + numbers[2]); // Output: 30

        // Iterate (loop) through the array using a standard 'for' loop
        // We use 'numbers.length' to get the size of the array (which is 5)
        System.out.println("Printing all elements with a 'for' loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        System.out.println("\n--- Method 2: Shorthand (Array Literal) ---");

        // You can declare, create, and initialize an array all in one line
        // This is very common for simple arrays.
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        // Access and print
        System.out.println("The first fruit is: " + fruits[0]); // Output: Apple

        // Iterate through the array using an 'enhanced for' loop (or 'for-each' loop)
        // This is a simpler way to loop when you just need each item
        // and don't care about the index.
        System.out.println("Printing all elements with an 'enhanced for' loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}