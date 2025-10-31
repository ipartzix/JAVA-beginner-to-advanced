//Write a program in Java to get input from the user
import java.io.*; public class get_user_input {
    public static void main(String[] args) {
        String snum;
        int num;
        try{
            DataInputStream input;
            input=new DataInputStream(System.in);
            System.out.println("Enter a integer number: ");
            snum=input.readLine();
            num=Integer.parseInt(snum);
            System.out.println("you entered="+num);
        }
        catch(Exception eobj){
            System.out.println("Error");
        }
    }
}
