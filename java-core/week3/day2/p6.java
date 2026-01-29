class p6{
    static int count;

    static {
        count = 100;
        System.out.println("static block executed");
    }
    {

        //non static or intializer block
        count = 200;
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(count);
        p6 obj = new p6();
        System.out.println(count);

        System.out.println("Main end");
    }
}