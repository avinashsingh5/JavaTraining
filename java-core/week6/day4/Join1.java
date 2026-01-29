class A extends Thread{
    public void run(){
        for(int i=0;i<=500;i++){
            System.out.println("Hello from class A");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<=500;i++){
            System.out.println("Hello from class B");
        }
    }
}
public class Join1{
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t1.join();
        t2.start();
    }
}