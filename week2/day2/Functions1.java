import java.util.Scanner;

// 1 2 5
public class Functions1 {

    public static int findMax(int a,int b ,int c){
      if(a>=b){
        if(a>=c) return a;
        else return c;
      }
      else{
        if(b>=c) return b;
        return c;
      }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = findMax(a,b,c);
        System.out.println(max);

    }
}