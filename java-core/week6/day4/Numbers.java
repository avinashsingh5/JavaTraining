class NumbersThread extends Thread{
    public void run(){
        for(int i=0;i<=500;i++){
            System.out.println(i);
            try{
                sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Numbers{
    public static void main(String[] args) {
        NumbersThread n = new NumbersThread();
        n.start();
    }
}