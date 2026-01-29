import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(25);
        for(int i: list){
            System.out.println(i);
        }

        if(list.contains(15)){
            System.out.println("15 exists in the list");
        }
        else{
            System.out.println("15 doesnt exist");
        }

        Collections.sort(list);
        list.remove(Integer.valueOf(5));

        for(int i: list){
            System.out.println(i);
        }
    }
}