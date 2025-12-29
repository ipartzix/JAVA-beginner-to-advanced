package OOPs_JAVA;
//Write a program to check the Array is Palindrom or not !!
public class P46_palindromeArrayCheck {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Palindrome Check");
        int [] numArr =ArrayUtility.inputArray();
        boolean palindrome = checkPalindrome(numArr);
        if(palindrome){
            System.out.println("Your Array is Palindrome");
        }
        else {
            System.out.println("Your Array is not Palindrome");
        }
    }
    public static boolean checkPalindrome(int [] numArr) {
        int i =0;
        while(i<numArr.length/2){
            if (numArr[i] != numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
