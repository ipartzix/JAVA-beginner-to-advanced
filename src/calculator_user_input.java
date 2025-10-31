//Write a program in Java to calculate +,-,×,÷ using user input

import java.io.DataInputStream;
public class calculator_user_input {
    public static void main(String[] args) {
        String snum;
        int num1,num2;
        try{
            DataInputStream input;
            input=new DataInputStream(System.in);
            System.out.println("Enter first number: ");
            snum=input.readLine();
            num1=Integer.parseInt(snum);
            System.out.println("Enter second number: ");
            snum=input.readLine();
            num2=Integer.parseInt(snum);
            System.out.println("The sum of "+num1+" and "+num2+" is:"+(num1+num2));
            System.out.println("The Subtraction of "+num1+" and "+num2+" is:"+(num1-num2));
            System.out.println("The product of "+num1+" and "+num2+" is:"+(num1*num2));
            System.out.println("The quotient of "+num1+" and "+num2+" is:"+(num1/num2));
            System.out.println("The reminder of "+num1+" and "+num2+" is:"+(num1%num2));
        }
        catch(Exception eobj) {
            System.out.println("Error");
        }
    }
}