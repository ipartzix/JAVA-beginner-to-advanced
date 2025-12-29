package OOPs_JAVA;

public class P43_ArrayShortedCheck {
    public static void main(String[] args) {
        System.out.println("Welcome to P43 Array Shorted Check");
        int [] numArr =ArrayUtility.inputArray();
        boolean isInc = IsIncreasing(numArr);
        boolean isDec = IsDecreasing(numArr);
        if (isDec || isInc){
            System.out.println("Array is sorted");
        }
        else
            {
            System.out.println("Array is not sorted");
            }
    }
    public static boolean IsIncreasing( int[] numArr)
    {
        int i =1;
        while(i < numArr.length)
        {
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean IsDecreasing( int[] numArr)
    {
        int i =1;
        while(i < numArr.length)
        {
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

