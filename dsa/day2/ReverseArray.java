import java.util.*;

public class ReverseArray {

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int s = m + 1;
        int e = arr.size() - 1;

        while (s < e) {
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" size of the array");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("position from where to reverse");
        int m = sc.nextInt();

        reverseArray(arr, m);

        for (int it : arr) {
            System.out.print(it + " ");
        }

        sc.close();
    }
}
