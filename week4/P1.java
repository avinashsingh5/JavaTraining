
class Adress{
    String city;
    String state;
    public Adress(String city,String state){
        this.city = city;
        this.state = state;
    }
    public void print
}

class Student{
    int id;
    String name;
    double marks;
    Adress adress;


    public Student(int id, String name, double marks,Adress adress ){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.adress = adress;
    }
}

public class P1{
    public static void main(String[] args) {
        Adress ad = new Adress("jalandhar","Punjab");

        Student s1 = new Student(1,"Avinash",89.99,ad);
    }
}