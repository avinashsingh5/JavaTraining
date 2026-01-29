public class DemoClass {
    static{
        System.out.println("first static initalization block start");
        System.out.println("second static initalization block end");
    }
    static{
        System.out.println("second static initalization block start");
        System.out.println("second static initalization block end");
    }

    DemoClass(){
        System.out.println("Constructor is called");
    }
    public void display(){
        System.out.println("Non static method display called");
    }
    public static void print(){
        System.out.println("first static method called");
    }
    public static void show(){
        System.out.println("Second static method called");
    }
    {
        System.out.println("Instance initialization block");
    }
    public static void main(String[] args) {
        DemoClass.print();
        DemoClass.show();
        DemoClass d1 = new DemoClass();
        d1.display();
    }
}