import java.util.Scanner;
import java.util.Collections;

public class Print{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Collections.reverse(s);
		System.out.println(s);
	}
}