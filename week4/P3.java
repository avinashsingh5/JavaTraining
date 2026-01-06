class Father{
    static int a = 10;
    public static void tet(){
        System.out.println("Father class static method");
    }
    static{
        System.out.println("SIB Father classs");
    }
}

class Son extends Father{
    static int b = 20;
    public static void demo(){
        System.out.println("Son class static method");
    }
    static{
        System.out.println("SIB son class");
    }
}

public class P3{
    static {
        System.out.println("SIB Driver class");
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println(Son.b);
        System.out.println("Main end");
    }
}