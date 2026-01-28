//basics of interfaces

interface Test{
    final int a = 10;
    public void show();

    //private methods can only be used as a helper method inside the interface

    private void display(){
        System.out.println("Display method");
    }

    static void hello(){
        System.out.println("Hello");
    }

    // static void name();  CTE a static method in an interface must have a body
}

 class TestClass implements Test{
    public void show(){
        System.out.println("Show method");
    }

}

public class Main1{
    public static void main(String[] args) {
        TestClass c1 = new TestClass();
        c1.show();
        System.out.println(c1.a);
        Test.hello();
    }
}