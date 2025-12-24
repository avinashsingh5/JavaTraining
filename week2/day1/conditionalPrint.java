import java.util.Scanner;

public class conditionalPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int num=0;num<n;num++){
        if(num %3 ==0 && num %5 ==0){
            System.out.println(num + " : FizzBuzz");
        }
        else if(num %3 ==0){
            System.out.println(num + ": Fizz");
        }
        else if(num %5 ==0){
            System.out.println(num + ": Buzz");
        }
        else{
            System.out.println(num);
        }
        }
    }
}