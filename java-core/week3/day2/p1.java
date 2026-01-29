class p1 {
    //nonstatic variable 
    int a = 10;
    public void test(){
        System.out.println("test start");
        System.out.println("Directly: "+ a);
        System.out.println("With the help of this: "+ this.a);
        System.out.println("test end");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        p3 ref = new p3();
        ref.test();
        System.out.println("main end");
    }
}