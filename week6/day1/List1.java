import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
    }
}
