//A lambda expression is a concise way to implement the single abstract method of a functional interface

class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        addition a1 = new addition();
        a1.operation(5,2);
        MathOperation a2 = (a,b) -> System.out.println("The sum is "+(a+b));
        a2.operation(5,5);
    }
}

interface MathOperation{
     void operation(int a, int b);
}


class addition implements MathOperation{
    @Override
    public void operation(int a, int b){
        System.out.println("The sum of both the numbers is: "+ (a+b));
    }
}