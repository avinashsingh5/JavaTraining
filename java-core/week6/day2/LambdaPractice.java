
@FunctionalInterface
interface MyInterface{
    void show();
}

class Demo implements MyInterface{
    @Override
    public void show(){
        System.out.println("Calling from Demo class");
    }
}
class LambdaPractice{
    public static void main(String[] args) {
        System.out.println("Main start");
        MyInterface m1 = () -> System.out.println("calling from lambda Expression");
        m1.show();

        Demo d1 = new Demo();
        d1.show();
        
    }
}