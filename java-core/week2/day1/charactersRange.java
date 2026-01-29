//using while loop print characters in a given range

import java.util.Scanner;
import java.lang.Character;

public class charactersRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting character: ");
        char start = sc.next().charAt(0);
        System.out.print("Enter ending character: ");
        char end = sc.next().charAt(0);
        System.out.println();

        start = Character.toLowerCase(start);
        end = Character.toLowerCase(end);

        if(start <= end){
            while(start <= end){
                System.out.println((char)start);
                start++;
            }
        }
        else{
            while(start >= end){
                System.out.println((char)start);
                start--;
            }
        }
        sc.close();
    }
}