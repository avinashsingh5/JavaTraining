import java.util.Scanner;

public class SumInRange {
    public static int sum(int n){
        if(n>5) return 0;
        return n+sum(n+1);
    }
    public static void main(String[] args) {
        int ans = sum(1);
        System.out.println(ans);
    }
}