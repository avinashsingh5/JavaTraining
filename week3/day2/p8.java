public class p8{
    int id;
    String name;

    public p8(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("main start");
        p8 obj = new p8(5,"Avinash");
        System.out.println("main end");

    }
}