import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num = sc.nextInt();
        int evenDigitSum = 0;
        int oddDigitSum = 0;
        while(num >0){
            int digit = num%10;
            if(digit%2==0) evenDigitSum += digit;
            else oddDigitSum += digit;
            num = num/10;

        }
        System.out.println("Product of Even and odd digits are : "+(evenDigitSum*oddDigitSum));
        

    }
}