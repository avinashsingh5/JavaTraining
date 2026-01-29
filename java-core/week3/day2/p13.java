public class p13 {
    int id;
    String name;
    double sal;
    //default constructor
    public p13(){
        this.id = 101;
        this.name = "Unknown";
        this.sal = 50000.0;
    }
    //parameterised constructora
    public p13(int id){
        System.out.println("hello");
        this();
       
        this.id = id;
    }
    public p13(String name ){
        this();
        this.name = name;
    }
    public static void main(String[] args) {
        System.out.println("main start");
        p13  ref1 = new p13(1);
        System.out.println(ref1.id);
        System.out.println(ref1.name);
        System.out.println(ref1.sal);
    }
}