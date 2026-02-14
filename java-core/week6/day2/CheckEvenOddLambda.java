@FunctionalInterface
interface checkEven{
    boolean isEven(int a);
}

public class CheckEvenOddLambda{
    public static void main(String[] args) {
        checkEven c = (a) -> (a%2 == 0);
        System.out.println(c.isEven(10));
    }
}