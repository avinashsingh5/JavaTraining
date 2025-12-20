import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class arrayList {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the number of elements: ");
		int n;
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter element"+ i + ": ");
			list.add(sc.nextInt());

		}
		int sum = 0;
		for(int x: list){
			sum += x;
		}

		Collections.sort(list);
		System.out.println("ArrayList elements: " + list);
        System.out.println("Sum = " + sum);
        Collections.reverse(list);
        System.out.println("Arraylist elemts after reverse: "+ list);

	}
}

