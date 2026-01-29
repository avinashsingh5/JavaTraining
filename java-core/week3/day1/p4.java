//program to overload main method

public class p4 {
    public static void main(int a, int b){
        int sum = a+b;
        System.out.println("overloaded main method "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Main method ");
        main(2,4);
    }
}