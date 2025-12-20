import java.util.Scanner;

public class checkUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char  c = sc.next().charAt(0);
		String vowel = "aeiouAEIOU";
		String ans = "";
		if(c>=65 && c<=90){
			if(vowel.indexOf(c) != -1){
				ans = "Upper case vowel";
			}
			else{
				ans = "Not a vowel vowel";
			}
			System.out.println(ans);
		}

		else if(c>=97 && c<=122){
			if(vowel.indexOf(c) != -1){
				ans = "lower case vowel";
			}
			else{
				ans = "Not a vowel";
			}
			System.out.println(ans);
		}

		else {
			System.out.println("Not a character ");
		}
	}
}