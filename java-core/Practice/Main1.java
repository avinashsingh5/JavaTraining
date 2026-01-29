import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input values");
        String input = sc.nextLine();
        String[] parts = input.split(":");
        System.out.println(parts[0]);
        System.out.println(parts[1]);

    }
}