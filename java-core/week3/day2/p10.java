public class p10{
    int id;
    String name;

     public p10(int id, String name){
        this.id = id;
        this.name = name;
    }
    public p10(p10 obj){
        this.id = obj.id;
        this.name = obj.name;
    }
    public static void main(String[] args) {
        System.out.println("main start");
        p10 ref1 = new p10(1,"rohit");
        System.out.println(ref1.id);
        System.out.println(ref1.name);
        System.out.println("After copy constructor");
        p10 ref2 = new p10(ref1);
        System.out.println(ref2.id);
        System.out.println(ref2.name);
    }
}