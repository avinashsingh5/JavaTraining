import java.util.Scanner;

public class PrintOddRange {
    public static void print(int l, int u){
        if(l>u) return;
        if(l%2!=0) {
        System.out.println(l);
        }
        l++;
        print(l,u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(50,500);
    }
}