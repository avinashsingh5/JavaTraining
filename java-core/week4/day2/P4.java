class Father {
        public void show1(){
            System.out.println("Father show method");
        }   
}
class Son extends Father{
    public void show2(){
        System.out.println("Son show method");
    }
    public void fetch(){
        System.out.println("fetch method");
    }
}
public class P4{
    public static void main(String[] args) {
       Father A = new Son(); //upcasting
    //    A.show();

       Son c = (Son) A; //down casting
       c.show2();
       c.fetch();

    }
}