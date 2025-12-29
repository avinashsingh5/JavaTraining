public class p2{

    static{
        System.out.println("Hello from another static block");
    }

    static {
        System.out.println("Hello from static block");
    }
    
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main end");
    }
}