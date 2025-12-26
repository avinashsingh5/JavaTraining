import java.util.Scanner;

public class ArrayPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the values of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array Elements:");
        for(int i:arr){
            System.out.println(i);
        }
    }
}