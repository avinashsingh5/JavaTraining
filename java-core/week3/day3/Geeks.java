//Encapsulation example
class Programmer{
    private String name;

    //getter method
    public String getName(){
        return name;
    }

    //setter method
    public void setName(String name){
        this.name = name;
    }
}
public class Geeks{
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Avinash");
        System.out.println("Name of the programmer is: "+p.getName());
    }
}