import java.util.Scanner;

public class PracticeQuestion {

    public static double AverageFinder(int[]temperatures){
        double sum = 0;
        for(int i: temperatures){
            sum += i;
        }
        double n = temperatures.length;
        return sum/n;
    }
    public static void main(String[] args) {
        int[] sales = {120, 80, 150, 90, 200, 75, 110}; 
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

        double temp = AverageFinder(temperatures);
        System.out.println(Math.round(temp)+"c");
    }
}