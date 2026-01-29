import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to " + n + " are ");
        for(int num = 2;num<=n;num++){
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }

            }
                if(isPrime){
                    System.out.println(num);
                }
            
        }
        sc.close();
    }
}