import java.util.ArrayList;

class Employee{
    int EmployeeId;
    String name;
    double Salary;

    Employee(int EmployeeId,String name, double Salary){
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.Salary = Salary;
    }

    public static Employee createNewEmployee(int id, String empName, double empSalary){
        return new Employee(id,empName,empSalary);
    }

    public  void PrintEmployeeDetails(){
        System.out.println(EmployeeId);
        System.out.println(name);
        System.out.println(Salary);
    }
}

class Company{
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }
    
    public void printAllEmployeeDetails(){
        System.out.println("printing the Details of all employees");
        for(Employee e: employees){
            System.out.println(e.EmployeeId);
            System.out.println(e.name);
            System.out.println(e.Salary);
            System.out.println();
        }
       
    }
}

public class ArrayList2{
    public static void main(String[] args) {
        Employee e1= Employee.createNewEmployee(1,"Avinash",20000);
        e1.PrintEmployeeDetails();

        Employee e2 = Employee.createNewEmployee(2,"raunak",22000);
        
        Company c = new Company();
        c.addEmployee(e1);
        c.addEmployee(e2);
        c.printAllEmployeeDetails();
    }
}