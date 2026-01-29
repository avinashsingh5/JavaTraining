import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }

        temp = num;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum = sum + ((int)Math.pow(digit,count));
            temp = temp/10;
            count--;
        }
        if(sum == num){
            System.out.println("yes it is a disarium number");
        }
        else {
            System.out.println("NO it is not a disarium number");
        }
    }
}