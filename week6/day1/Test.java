class A {
    void show() throws Exception {
        System.out.println("A");
    }
}

class B extends A {
    void show() throws RuntimeException {
        System.out.println("B");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        A obj = new B();
        obj.show();
    }
}
