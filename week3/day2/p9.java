public class p9{
    int id;
    String name;
    double percentage;
    String college_name;

    public p9(int id){
        this.id = id;
    }
    public p9(double percentage){
        this.percentage = percentage;
    }
    public p9(String name){
        this.name = name;
    }
    public p9(int id,String name){
        this.id = id;
        this.name  = name;
    }

    public p9(int id, double percentage){
        this.id = id;
        this.percentage = percentage;
    }
    public p9(String name , double percentage){
        this.name = name;
        this.percentage = percentage;
    }
    public p9(int id, String name, double percentage){
        this.id = id;
        this.name  = name;
        this.percentage = percentage;
    }
    public p9(){
        id = 1;
        name = "Student";
        percentage = 80.00;
        college_name = "lpu";
    }
    public static void PrintDetails(p9 obj){
        System.out.println("Id: "+ obj.id);
        System.out.println("Name: "+obj.name);
        System.out.println("Percentage: "+obj.percentage);
        System.out.println("College Name: "+obj.college_name);
        System.out.println();
    }

    public static void main(String[] args) {
        p9 obj = new p9();
        obj.PrintDetails(obj);

        p9 obj1 = new p9("Avinash",80.50);
        obj1.PrintDetails(obj1);

        p9 obj2 = new p9(5,"Akash",70.80);
        obj2.PrintDetails(obj2);

    }
}