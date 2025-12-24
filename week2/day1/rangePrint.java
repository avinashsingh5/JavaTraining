//using while loop print numbers in a given range

import java.util.Scanner;

public class rangePrint {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        //if both are negative
        if(start < 0 && end < 0){
           while(start>=end){
               System.out.println(start);
               start--;
           }
        }
        //if both are positive
        else if(start >=0 && end >=0){
            while(start <=end){
                System.out.println(start);
                start++;
            }
        }
        else {
            if(start>=end){
                while(start>=end){
                    System.out.println(start);
                    start--;
                }
            }
            else{
                while(start<=end){
                    System.out.println(start);
                    start++;
                }
            }
        }
        sc.close();

    }
}