// overriding toString method 
public class P1 {
    int id;
    String name;

    public P1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "P1 [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        P1 ref = new P1(1, "Mohit");
        System.out.println(ref);
        System.out.println(ref.toString());
    }
}
