
public class RegexExample{
    public static void main(String[] args) {
        String s = "c1 O$d@eeD o1c";
        System.out.println(s.toLowerCase().replaceAll("[^0-9]",""));
        System.out.println(s);
    }
}