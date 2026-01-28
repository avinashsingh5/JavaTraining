public class Thread_Scheduler extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread_Scheduler t1 = new Thread_Scheduler();
        Thread_Scheduler t2 = new Thread_Scheduler();
        Thread_Scheduler t3 = new Thread_Scheduler();
        Thread_Scheduler t4 = new Thread_Scheduler();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

