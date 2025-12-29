package OOPs_JAVA;
//sum and average all element in  2D array
public class P49_SumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array");
        int [][] numArr = ArrayUtility.input2DArray();
        int sum =sumArray(numArr);
        double avg =avgArray(numArr);
        System.out.println("The sum is : "+sum);
        System.out.println("The average is : "+avg);
    }

    public static int sumArray(int[][] numArr){
        int sum =0;
        int i =0;
        while(i<numArr.length){
            int j =0;
            while(j<numArr[i].length){
                sum=sum+numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avgArray(int[][] numArr ) {

        // youtube sir code
//        if (numArr.length == 0)
//            return 0;
//        int rows = numArr.length;
//        int cols = numArr[0].length;
//        double size =rows*cols;
//        return sumArray(numArr)/size ;
//
//    }


           // my code
        int avg = 0;
        int sum = 0;
        int cout = 0;

        int i =0;
        while(i<numArr.length){
            int j =0;
            while(j<numArr[i].length){
                sum=sum+numArr[i][j];
                j++;
                cout ++;// Increment count for every element visited
            }
            i++;
        }
        return (double) sum/cout;// Use double to avoid "Integer Division" which removes decimals
    }
}
