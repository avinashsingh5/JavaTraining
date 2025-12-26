
interface testInterface {
    //public static and final keywords can be used
    final int a = 10;

    //public and abstract 
    void display();
    void displaymultipletimes();
}

//class implementing interface
class TestClass implements testInterface {
    //implementing the capablities of interfaces
    public void display(){
        System.out.println("Geeks");
    }
    public void displaymultipletimes(){
        System.out.println("Geeks1");
        System.out.println("Geeks2");
    }
}

class Geeks {
    public static void main(String args[]){
        TestClass t1 = new TestClass();
        t1.display();
        System.out.println(t1.a);
        TestClass t2 = new TestClass();
        t2.display();
        System.out.println(t2.a);
        t2.displaymultipletimes();
    }
}