class Father {
    public static void test() {
        System.out.println("Father class demo method");
    }

    public void demo(int a) {
        System.out.println("Father class demo method called");
    }
}

class Son extends Father {
    public static void test() {
        System.out.println("Son class test method");
    }

    // static → non-static (cannot hide instance method)
    public void demo(int a) {
        System.out.println("Son class demo method");
    }
}

public class P2 {
    public static void main(String[] args) {

        System.out.println("Main start");

        System.out.println("Father object stored in Father ref variable--");
        Father ref1 = new Father();
        ref1.test();
        ref1.demo(10);   // added argument

        System.out.println("\n--Son object store in Son ref variable--");
        Son ref2 = new Son();
        ref2.test();
        ref2.demo(20);   // added argument

        System.out.println("\n--Upcasting--");
        Father ref3 = new Son();
        ref3.test();
        ref3.demo(30);   // added argument

        System.out.println("--Downcasting--");
        Son ref4 = (Son) ref3;
        ref4.test();
        ref4.demo(40);   // added argument
    }
}
