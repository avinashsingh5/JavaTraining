import java.util.Scanner;
import java.util.*;
class LanguageModel{

    public static void EvenRevese(String s){
        String [] words = s.split("\\s+");
        int i = 0 , j= words.length-1;
        while(i<j){
            String temp =words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }


        for(int k=0;k<words.length;k++){
            System.out.print(words[k]);
            if(k != words.length-1) System.out.print(" ");
        }

    }
    public  static void OddReverse(String s){
        String[] words = s.split("\\s+");
        for(int i=0;i<words.length;i++){
            String sb = new StringBuilder(words[i]).reverse().toString();
            System.out.print(sb);
            if(i!= words.length-1) System.out.print(" ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(!s.matches("[a-zA-Z ]+$")){
            System.out.println("Invalid sentence");
            return;
        }
        else{
            String[] list = s.split(" ");
            int size = list.length;

            if(size%2==0){
                //even
                EvenRevese(s);
            }
            else{
                //odd
                OddReverse(s);
            }
        }

    }
}