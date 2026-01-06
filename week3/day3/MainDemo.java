public class MainDemo{
    static int  a = 20;
    int b ;

    {
        System.out.println("Non static initializer bolck");
    }

    static{
        System.out.println("static initlizer block");
    }
    MainDemo(int b){
        this.b = b;
        System.out.println("contructor ran");
    }

    public void display(){
        System.out.println("display method start");
    }
    public static void display1(){
        System.out.println("static method ran ");
    }


    public static void main(String[] args) {
        MainDemo m1 = new MainDemo(30);
        System.out.println("Main start");
        MainDemo m2 = new MainDemo(50);
        System.out.println("Main end");
    }
}
//static ini
//non static
//constructo run
//main strt
//construn
//maon end