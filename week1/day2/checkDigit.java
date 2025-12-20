import java.util.Scanner;
public class checkDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		// String Digits = "0123456789";
		// if(Digits.indexOf(c) != -1){
		// 	System.out.println("It is a number");
		// }
		// else {
		// 	System.out.println("It is not a number");
		// }
		if(c==48){
			System.out.println("converted to ascii");
		}
	}
}