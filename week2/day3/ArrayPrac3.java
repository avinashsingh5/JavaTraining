import java.util.Scanner;

public class ArrayPrac3 {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("All the prime numbers in the array are");
        for(int i: arr){
            if(isPrime(i))System.out.println(i);
        }
    }
}