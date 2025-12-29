//      write a program in java to perform  the following operation
//      1. left shift
//      2. Right Shift
//      3. AND
//      4. OR
//      5. Complement
//      6. XOR
@SuppressWarnings("all")
public class Assingment {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        byte c;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("--------------Right Shift---------------");
        c = (byte) (a>>1);
        System.out.println("a = "+c);

        System.out.println("--------------Left Shift----------------");
        c = (byte) (a<<1);
        System.out.println("a = "+c);

        System.out.println("--------------Complement----------------");
        c = (byte) (~a);
        System.out.println("a = "+c);

        System.out.println("-------------------AND------------------");
        c = (byte) (a & b);
        System.out.println("c = "+c);

        System.out.println("-------------------OR-------------------");
        c = (byte) (a|b);
        System.out.println("c = "+c);

        System.out.println("-------------------XOR------------------");
        c = (byte) (a|b);
        System.out.println("c = "+c);
    }
}