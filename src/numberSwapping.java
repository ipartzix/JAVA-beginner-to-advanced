class numberSwapping {
    public static void main(String[] args){
        int firstNum = 4, secondNum = 6;
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("After swap the 1st number is " + firstNum);
        System.out.println("After swap the 2nd number is " + secondNum);




        // here we use 3rd variable ands this file have both funcality like 2 type code are in one
        int SECfirstNum =43;
        int SECsecondNum =96;
        int SECtemp ;
        SECtemp= SECfirstNum;
        SECfirstNum =SECsecondNum;
        SECsecondNum=SECtemp;
        System.out.println("After swap the 1st number is " +SECfirstNum);
        System.out.println("After swap the 2nd number is " +SECsecondNum);



    }
}
