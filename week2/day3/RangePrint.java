import java.util.Scanner;

public class RangePrint {
    public static void Print(int lower,int upper){
        if(lower>upper) return;
        System.out.println(lower);
        lower++;
        Print(lower,upper);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int lower = sc.nextInt();
        System.out.println("Enter the last number");
        int upper = sc.nextInt();
        Print(lower,upper);
    }
}