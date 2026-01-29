import java.util.Scanner;

public class DigitPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Digits in the number are: ");
        while(num >0){
            int digit = num %10;
            System.out.println(digit);
            num = num /10;
        }
        sc.close();
    }
}