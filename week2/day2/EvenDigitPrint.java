import java.util.Scanner;

public class EvenDigitPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("All the even digits in the number: ");
        while(num>0){
            int digit = num%10;
            if(digit%2==0)System.out.println(digit);
            num = num/10;
        }
        sc.close();
    }
}