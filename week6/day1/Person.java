import java.util.HashSet;

public class Person{
    int id;
    String name;
   

     public Person(int id,String name){
        this.id = id;
        this.name = name;   
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null || getClass() != obj.getClass())return false;
       Person person = (Person) obj;
       return id == person.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }

    @Override
    public String toString(){
        return "id: "+id+", Name: "+name;
    }

    public static  void main(String[] args) {
        Person p1 = new Person(1,"A");
        Person p2 = new Person(1,"B");
        Person p3 = new Person(3, "C");


        HashSet<Person> h = new HashSet<>();
        h.add(p1);
        h.add(p2);
        h.add(p3);

        System.out.println(h.size());

        for(Person p: h){
            System.out.println(p);
        }
    }
}
