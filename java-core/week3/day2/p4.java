//write a java program to execute instance intializer block  and execute non static 
// method before the execution of main method 

class p4 {
    {
        //instance intializer block 
        System.out.println("instance intializer block start");
        
        System.out.println("instance intializer block end");

    }
    void print(){
            System.out.println("Hello from non static method");
        }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main end");
    }
    static {
        System.out.println("static block executed");
        p4 obj = new p4();
        obj.print();
    }
}