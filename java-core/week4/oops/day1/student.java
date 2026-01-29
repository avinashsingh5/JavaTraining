import java.util.Scanner;

public class student {
    String name;
    int age;
    int regno;

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Reg No: " + regno);
    }
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Avinash";
        s1.age = 22;
        s1.regno = 12215935;

        student s2 = new student();
        s2.name = "Rohan";
        s2.age = 23;
        s2.regno = 12215936;

        System.out.println(s2.name+ " is "+s2.age+" and his reg no is "+s2.regno);

    }
}