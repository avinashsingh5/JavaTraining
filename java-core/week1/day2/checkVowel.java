import java.util.Scanner;
public class checkVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		String vowel = "aeiouAEIOU";
		if(vowel.indexOf(c) != -1){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}
	}
}