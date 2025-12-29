import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            System.out.println(i);
        }
        int i= 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
        sc.close();
    }
}