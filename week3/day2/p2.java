public class p2{
    static int a = 10;

    public void test(){
        System.out.println("test start");
        System.out.println("Directly: "+a);
        System.out.println("With the help of className: "+p2.a);
        System.out.println("wtith the help of this "+this.a);
        System.out.println("tets end");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        p2 ref = new p2();
        ref.test();
        System.out.println("main end");
    }
}