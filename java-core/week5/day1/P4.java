
import java.util.Scanner;
class NotEligibleException extends Exception{
    public NotEligibleException(String msg){
        System.out.println(msg);
    }
}
public class P4{
    public static void main(String[] args) {
        System.out.println("Main start");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try {
            eligibleforvoting(age);
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }
        System.out.println("Main end");

        public static void eligibleForVoting (int age) throws NotEligibleException{
            if(age>18){
                System.out.println("Eligible for voting");
            }
            else {
                throw new NotEligibleException("Your age is below 18 ");
            }
        }
    }
}