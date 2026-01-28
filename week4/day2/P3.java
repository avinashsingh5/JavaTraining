class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
    void fetch(){
        System.out.println("Animal is fetching");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}

class Parent{
    void show(){
        System.out.println("Parent method");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Child method");
    }
}

public class P3{
    public static void main(String[] args) {
        Animal a  = new Dog(); //Upcasting
        a.sound(); //class Dog's suond()
        a.fetch();
        Parent p = new Child();
        p.show();
    }
}