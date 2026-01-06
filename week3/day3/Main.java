class A {
    static int x = 10;

    static {
        x += 5;
        System.out.println("A static block: x = " + x);
    }

    {
        x += 2;
        System.out.println("A instance block: x = " + x);
    }

    A() {
        x += 3;
        System.out.println("A constructor: x = " + x);
    }

    void show() {
        System.out.println("A show(): x = " + x);
    }
}

class B extends A {
    static int x = 20;

    static {
        x += 10;
        System.out.println("B static block: x = " + x);
    }

    {
        x += 5;
        System.out.println("B instance block: x = " + x);
    }

    B() {
        x += 2;
        System.out.println("B constructor: x = " + x);
    }

    void show() {
        System.out.println("B show(): x = " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        System.out.println("A.x = " + A.x);
        System.out.println("B.x = " + B.x);
    }
}
