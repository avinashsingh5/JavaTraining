 class Father{
    public void show1(){
        System.out.println("show1 of father class");
    }
    public void Fetch(){
        System.out.println("Fetch metho of father class");
    }
}
 class Son extends Father{
    public void show2(){
        System.out.println("Show2 of son class");
    }
    public void Fetch(){
        System.out.println("Fetch method of son class");
    }
}
public class P6{
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println("--object of father store inside father class ref variable--");
        Father ref1 = new Father();
        ref1.show1();
        // ref1.show2(); cte
        System.out.println("--Object of son store inside son class ref variable--");
       Son ref2 = new Son();
       ref2.show1();
       ref2.show2();
       ref2.Fetch();
       System.out.println("--upcasting --");
       Father ref3 = new Son();
       ref3.show1();
    //    ref3.show2();
       ref3.Fetch();
       System.out.println("Downcasting");
       Son ref4 = (Son) ref3;
       ref4.show1();
       ref4.show2();
       ref4.Fetch();
    }
}