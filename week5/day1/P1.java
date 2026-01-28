//basic program for try and catch block

import java.util.Scanner;
import java.util.InputMismatchException;
public class P1{
    public static void main(String[] args) {
        System.out.println("Main start");
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int ans = a/b;
        System.out.println("ans: "+ans);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Handeled");
        }
        finally{
            System.out.println("Finally block executed");
            sc.close();
        }
        System.out.println("Main end");
    }
}