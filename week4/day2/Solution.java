abstract class Shape{
    abstract double calculateArea();

    public void printarea(){
        System.out.println("Area is: "+calculateArea());
    }
}

 class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

}

 class Rectangle extends Shape {
    double lenght;
    double bredth;

    Rectangle(double lenght,double bredth){
        this.lenght = lenght;
        this.bredth = bredth;
    }
    @Override
     double calculateArea(){
        return lenght * bredth;
    }
}

public class Solution{
    public static void main(String[] args) {
        Shape c = new Circle(5.1);
        c.printarea();
        Shape r = new Rectangle(3,4);
        r.printarea();
    }
}