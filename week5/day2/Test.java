public class Test{
    public static void main(String[] args) {
        Student x = new Student();
        x.id = 1;
        System.out.println("adress of x before running function: " + x);
        fun(x);
        System.out.println("adress of x is" + x);
    }

    private static void fun(Student a){
        Student b = new Student();
        b.id = 2;
        System.out.println("the address of b is: "+b);
        a=b;
    }
}

class Student{
    int id;

}