import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main3{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date ");
        String d = sc.nextLine();
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(d);
        System.out.println(date);
    }
}