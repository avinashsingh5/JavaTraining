import java.util.Scanner;

public class secondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new arr(n);
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		//logic to find second largest element
		int firstL  = arr[0];
		int secL  = Integer.MIN_VALUE;
		for(int i=1;i<n;i++){
			if(arr[i]>firstL){
				secL = firstL;
				firstL = arr[i];
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}