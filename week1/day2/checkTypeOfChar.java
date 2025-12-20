import java.util.Scanner;

public class CheckTypeOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if (c >= '0' && c <= '9') {
            System.out.println("It is a digit");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("It is Uppercase");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("It is Lowercase");
        } else {
            System.out.println("Special character");
        }

        sc.close();
    }
}
