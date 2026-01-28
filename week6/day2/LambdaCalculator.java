
@FunctionalInterface
interface MathOperation{
    int operation(int a, int b);
}

public class LambdaCalculator{
    public static void main(String[] args){
        int x = 60;
        int y = 30;
        MathOperation add = (a,b) -> a+b;
        MathOperation subtract = (a,b)-> a-b;
        MathOperation multiply = (a,b)-> a*b;
        MathOperation divide = (a,b) -> a/b;
        System.out.println("Sum of "+ x +" and "+ y +" is "+add.operation(x,y));
        System.out.println("Difference between "+x+" and "+ y + " is "+subtract.operation(x,y));
        System.out.println("Product of "+ x +" and "+ y + " is " + multiply.operation(x,y));
        System.out.println("Quotient of "+ x + " and "+ y + " is "+divide.operation(x,y));
    }

}