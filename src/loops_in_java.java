import java.util.Scanner;

public class loops_in_java {
    public static void main(String[] args) {
//        int num =1;//initialization
//        while (num <= 10) { //condition
//             System.out.println(num);//actual work
//            num= num+1;//updating the condition
//        }
//int count=500;
//        while(count>= 1 ){
//            System.out.println(count);
//            count =count-1;
//        }

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:-");
        int n= input.nextInt();
        while(n<=10){
            System.out.println(n);
            n=n+1;
        }

    }
}