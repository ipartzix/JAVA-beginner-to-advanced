public class swappingWithOut3rdVar {
    public static void main(String[] args){
        int firstNum = 4, secondNum = 6;
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("After swap the 1st number is " + firstNum);
        System.out.println("After swap the 2nd number is " + secondNum);
    }
}