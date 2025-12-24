import java.util.Scanner;

public class basicForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        for(int i= start ;i <= end; i++){
            System.out.println(i);
        }
    }
}