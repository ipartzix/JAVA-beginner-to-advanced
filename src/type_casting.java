public class type_casting {
    public static void main(String[] args){
        float myFloat =5;
        System.out.println(myFloat);

        int myInt = (int) 5.40f;
        System.out.println(myInt);
        //implicit
        long big =45;
        float dec =4;
        double d=3.45f;

        //explecit
        float eDec= (float) 3.5;
        long eBig = (long) 3.4;
        int EInt = (int) 3.67;
    }
}
