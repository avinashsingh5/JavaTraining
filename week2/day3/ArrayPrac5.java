import java.util.Scanner;
import java.util.*;

public class ArrayPrac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched: ");
        int key = sc.nextInt();
        Arrays.
        int index = Arrays.binarySearch(arr,key);
        System.out.println(key+"is present at the index "+index);
        System.out.println(index);
        
        System.out.println("Arrays in sorted order");
        for(int i:arr){
            System.out.println(i);
        }
        Arrays.binarySearch(arr,key);
    }
}