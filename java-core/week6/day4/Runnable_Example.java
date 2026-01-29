class MyTask implements Runnable {
    public void run() {
        System.out.println("task on " + Thread.currentThread().getName());
    }
}

public class Runnable_Example {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
        Thread t2 = new Thread(new MyTask());
        t2.start();
    }
}
