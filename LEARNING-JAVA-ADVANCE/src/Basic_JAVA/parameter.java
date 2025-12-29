public class parameter {
    public static void main(String[] args) {
        int num= sum(6,9);
        System.out.println(num);
    }
    public static int sum(int first ,int second){
        System.out.println("First number received :"+first);
        System.out.println("Second number received :"+second);
        return first+second;
    }
}