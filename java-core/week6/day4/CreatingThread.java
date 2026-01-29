//creating thread using class 

public class CreatingThread extends Thread{
    public void run(){
        System.out.println("Thread running");
        System.out.println("running in " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CreatingThread t = new CreatingThread();
        CreatingThread t1 = new CreatingThread();
        t.start();
        t1.start();
    }
}