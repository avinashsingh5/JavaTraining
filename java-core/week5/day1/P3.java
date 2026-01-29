//java program to handle classcast Exception


class Father{

}

class child extends Father{

}

public class P3{
    public static void main(String[] args) {
        try{
        Father f1 = new Father();
        child c = (child) f1;
        }
        catch(ClassCastException e){
            System.out.println("Invalid type casting");
        }

    }
}
