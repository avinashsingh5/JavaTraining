class Father {
    int a = 10;
    static int b = 100;
}

class Son extends Father {
    int a = 20;
    static int b = 200;
}

public class P1 {
    public static void main(String[] args) {

        System.out.println("Main start");

        System.out.println("Father object stored in father ref variable--");
        Father ref1 = new Father();
        System.out.println(ref1.a);
        System.out.println(ref1.b);

        System.out.println("\n--Son object stored in son ref variable--");
        Son ref2 = new Son();
        System.out.println(ref2.a);
        System.out.println(ref2.b);

        System.out.println("\n--upcasting--");
        Father ref3 = new Son();
        System.out.println(ref3.a);
        System.out.println(ref3.b);

        System.out.println("--downcasting--");
        Son ref4 = (Son) ref3;
        System.out.println(ref4.a);
        System.out.println(ref4.b);

        System.out.println("Main end");
    }
}
