class p5{
    p5(){
        System.out.println("Hello from the constructor");
    }
    static {
        System.out.println("Hello from first static block");
    }
    static{
        System.out.println("Hello from second static block");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main end");
        p5 obj = new p5();
    }
    {
        //non static block (instance block)
        System.out.println("Hello from non static block");
    }
    
}