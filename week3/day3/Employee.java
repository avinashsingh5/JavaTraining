public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id,String name , double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("id: "+ id);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee e1  = new Employee(1,"Avinash",60000.0);
        e1.print();
        
    }
}