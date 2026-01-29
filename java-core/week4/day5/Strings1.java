import java.util.*;
public class Strings1{
    public static void main(String[] args) {
        String s = "Avinash  Kumar    Singh   is studying                           cse";
        String[] words = s.trim().split("\\s+");
        Collections.reverse(words);
        for(String c: words){
            System.out.println(c);
        }
    }
}