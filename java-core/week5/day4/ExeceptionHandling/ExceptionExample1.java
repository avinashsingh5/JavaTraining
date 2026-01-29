package week5.day4.ExeceptionHandling;

public class ExceptionExample1{
    public static void main(String[] args) {
        int[] numerators = {10,200,300,40};
        int[] denominators = {1,2,0,4};

        for(int i=0;i<numerators.length;i++){
            System.out.println(divide(numerators[i],denominators[i]));
        }
    }

    public static int divide(int a, int b){
       return a/b;
    }
}

