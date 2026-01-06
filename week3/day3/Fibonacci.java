import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        int first = 0;
        int second = 1;
        Scanner sc = new Scanner(System.in);
        int fib= 0;
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            fib= first+second;
            first = second;
            second = fib;
        }
        System.out.println("Fibonacci of "+ n +" is: "+fib);
    }
}