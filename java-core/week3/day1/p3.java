class p3{
    public static void main(String[] args) {
        System.out.println("main start");
        A.test();
        System.out.println("main end");
    }
    static{
        System.out.println("Welcome to lpu");
    }
}

class A{
    static{
        System.out.println("Welcome to class A");
    }
    public static void test() {
        System.out.println("test start");
        System.out.println("test end");
    }
}