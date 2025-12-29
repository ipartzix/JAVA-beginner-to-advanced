package OOPs_JAVA;
//P40 mean problem number 40 in YouTube video
import java.util.Scanner;
public class P40_SumAndAverage
{
    public static void main(String[] args)
    {
        System.out.println("welcome to the Sum and average of array");
        int [] numArray= ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("Sum of the number is : "+sum);
        System.out.println("Average of the number is : "+avg);
    }
    public static long sum(int[] numArray){
        long sum =0;
        int i=0;
        while (i<numArray.length){
            sum= sum+numArray[i];
            i++;
        }
        return sum;
    }
    public static double  avg(int[] numArray){
        double  sum=sum(numArray);
        return  (sum / numArray.length);
    }
}