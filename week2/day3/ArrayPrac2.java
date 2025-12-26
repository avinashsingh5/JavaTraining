import java.util.Scanner;

public class ArrayPrac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("All even values in the array is ");
        for(int i: arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}