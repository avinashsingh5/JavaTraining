public class p3{
    {
        //non static block or Instance intializer block
        System.out.println("--New object created for p3 class");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        p3 ref = new p3();
        p3 obj = new p3();
        p3 obj1 = new p3();
        System.out.println("main end");
    }
}