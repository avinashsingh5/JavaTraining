//write a java program to remove duplicates from given list

import java.util.ArrayList;
import java.util.List;
public class P1{
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(13);
        al.add(12);
        al.add(14);
        al.add(14);
        al.add(null);
        al.add(15);
        al.add(11);
        al.add(10);
        al.add(16);
        al.add(null);
        al.add(10);
        System.out.println("al: "+al);
        List<Integer> result = new ArrayList<>();

        for(Integer i:al){
            if(!result.contains(i)){
                result.add(i);
            }
        }

        System.out.println("list after removing duplicates: "+result);



    }
}