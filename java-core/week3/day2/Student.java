import java.util.Arrays;
public class Student{
    int id;
    String name;
    int[] marks = new int[3];
    //parametarized constructor
    public Student(int id, String name, int[] marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public Student(Student obj){
        this.id = obj.id;
        this.name = obj.name;
        this.marks = obj.marks.clone();
    }
    public static void  PrintDetails(Student obj){
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(Arrays.toString(obj.marks));
    }
    public static void main(String[] args) {
        int marks[] = {89,92,89};
        Student s1 = new Student(1,"Avinash",marks);
        Student s2 = new Student(s1);
        PrintDetails(s1);
       PrintDetails(s2);
        // s2.marks = new int[]{100,100,100};
        s1.marks[0] = 100;
        s2.marks[1]= 90;
        s2.marks[2] = 80;
        s2.name = "Akash";
        PrintDetails(s2);
        PrintDetails(s1);

    }
}