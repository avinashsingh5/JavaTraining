import java.util.*;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements");
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " value : ");
            arr.add(sc.nextInt());
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr.get(i);

            // Smallest & Second Smallest
            if (val < smallest) {
                secondSmallest = smallest;
                smallest = val;
            } else if (val > smallest && val < secondSmallest) {
                secondSmallest = val;
            }

            // Largest & Second Largest
            if (val > largest) {
                secondLargest = largest;
                largest = val;
            } else if (val < largest && val > secondLargest) {
                secondLargest = val;
            }
        }

        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + secondLargest);
    }
}
