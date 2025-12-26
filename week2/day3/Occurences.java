import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the values to be searched: ");
        int value = sc.nextInt();
        for(int i: arr){
            int count = 0;
             String s = String.valueOf(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)-'0'==value){
                    count++;
                }
            }
            System.out.println(value + "occurs"+count +"times");
        }


    }
}
