public class P2 {
    int id;
    String name;

    public P2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        P2 ref = new P2(1, "Avinash");
        
        System.out.println(ref.hashCode());
        System.out.println(Integer.toHexString(ref.hashCode()));

        System.out.println(ref);

        System.out.println(ref.getClass());

        System.out.println(ref.getClass().getName());

        System.out.println(
            ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode())
        );
    }
}
