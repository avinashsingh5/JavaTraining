public class Employee  {
    //instance variable
    static final String company = "Hp";
   private String name;
   private float salary;
   private  String role;

   //constructor
   public Employee(String name,String role,float salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
   }
   //getter
   public String getName(){return name;}
   public String getRole(){return role;}
   public float getSalary(){return salary;}


   //setter
   public void setName(String name){this.name = name;}
   public void setRole(String role){this.role = role;}
   public void setSalary(float salary){this.salary = salary;}

   //Instance Methods
   public void displayDetails(){
    System.out.println("Employee Name: "+name + " is at the role of "+ role + " with a salary of "+salary+" at "+ company);
   }

    public static void main(String[] args){
        Employee e1 = new Employee("Avinash","developer",100000.0f);
        Employee e2 = new Employee("Amar","Testing",12000.0f);
        e1.displayDetails();
        e2.displayDetails();

    }
}