public class Employee{
    protected String name;
    protected double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus(){
        double bonus = 0.1*salary;
        return bonus;
    }

    public static void main(String[] args) {
        Employee e1 = new Manager("Avinash",80000.00,2000);
        System.out.println("Your bonus is: " + e1.calculateBonus());
    }
}

class Manager extends Employee{
    protected double incentive;

    Manager(String name, double salary, double incentive){
        super(name, salary);
        this.incentive = incentive;
    }

    public double calculateBonus(){
        return 0.2*salary + incentive;
    }
}