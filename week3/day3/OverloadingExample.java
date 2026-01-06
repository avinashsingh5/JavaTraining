public class OverloadingExample{
    public static void display(int a){
        System.out.println("You provided integer value: "+a);
    }
    public static void display(String s){
        System.out.println("You provided string value: "+s);
    }
    public void display(int a , double d){
        System.out.println("Integer value: "+ a+" double value: "+d);
    }
    public void display(){
        System.out.println("You didnt provided any values");
    }
    public static void main(String[] args) {
        OverloadingExample o1 = new OverloadingExample();
        o1.display(2,500.00);
        o1.display();

    }
}