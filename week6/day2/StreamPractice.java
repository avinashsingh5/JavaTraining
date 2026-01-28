import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students {
    int id;
    String name;
    double marks;

    Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}


public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("To print all elements one by one");
        numbers.stream().forEach(System.out::println);

        System.out.println("\nTo print only even elements");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("\nTo print odd numbers with extra value 3");
        numbers.stream().filter(n -> n % 2 != 0).map(n -> n + 3).forEach(System.out::println);

        System.out.println("\nFind even numbers and stored in another list");
        List<Integer> even_collector = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even_collector);


        List<String> names = List.of("Nitish","Avinash","aditya","mohan","dev","ramesh");
        System.out.println("Print Objects end with sh using stream");
        names.stream().filter(name -> name.endsWith("sh")).forEach(System.out::println);

        List<Students> st = List.of(
            new Students(3,"Murali",75.5),
            new Students(4,"Aditya",85.5),
            new Students(5,"Vishnu",80.5),
            new Students(2,"Pramod",90.5)
        );
        System.out.println("\n print only those who got marks more than 80 using stream");
        st.stream().filter(s -> s.marks > 80).forEach(System.out::println);


    }
}
