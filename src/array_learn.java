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
}