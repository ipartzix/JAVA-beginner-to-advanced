package OOPs_JAVA;

public class P47_MargeTwoArray {
    public static void main(String[] args) {
        System.out.println("Welcome to P47 Marge Two shorted Array\n");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = margeTwoArray(arr1, arr2);
        System.out.println("The merged array is : ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] margeTwoArray(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        return mergedArr;
    }
}