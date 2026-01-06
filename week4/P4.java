
class Father{
    static{
        System.out.println("Static block of Father class");
    }
    {
        System.out.println("Non static block of Father  class");
    }
    public Father(){
        System.out.println("Consturtor of Father  class");
    }
}
class Son extends Father{
    static{
        System.out.println("Static block of son class");
    }
    {
        System.out.println("Non static block of son class");
    }
    public Son(){
        System.out.println("Constructor of son class");
    }
}
public class P4{
    {
        System.out.println("NOn static block of p4 class");
    }
    public static void main(String[] args) {
        System.out.println("Main start");
        Son s1 = new Son();
        System.out.println("Main end");
    }
}