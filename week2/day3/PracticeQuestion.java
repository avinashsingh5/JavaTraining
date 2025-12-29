public class PracticeQuestion {

    static double averageTemperature(int[] temp) {
        int sum = 0;
        for (int t : temp) {
            sum += t;
        }
        return (double) sum / temp.length;
    }

    static void hottestAndColdestDay(int[] temp) {
        int max = temp[0], min = temp[0];
        int maxDay = 1, minDay = 1;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                maxDay = i + 1;
            }
            if (temp[i] < min) {
                min = temp[i];
                minDay = i + 1;
            }
        }

        System.out.println("Highest Temperature: " + max + "°C on Day " + maxDay);
        System.out.println("Lowest Temperature: " + min + "°C on Day " + minDay);
    }

    static int countHotDays(int[] temp) {
        int count = 0;
        for (int t : temp) {
            if (t > 30) {
                count++;
            }
        }
        return count;
    }
   
    static void totalAndAverageSales(int[] sales) {
        int sum = 0;
        for (int s : sales) {
            sum += s;
        }
        double avg = (double) sum / sales.length;

        System.out.println("Total Sales: " + sum);
        System.out.printf("Average Sales: %.2f\n", avg);
    }

    static void recordBreakingSales(int[] sales) {
        int max = sales[0], min = sales[0];
        int maxDay = 1, minDay = 1;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
                maxDay = i + 1;
            }
            if (sales[i] < min) {
                min = sales[i];
                minDay = i + 1;
            }
        }

        System.out.println("Highest Sale: " + max + " on Day " + maxDay);
        System.out.println("Lowest Sale: " + min + " on Day " + minDay);
    }

    static int countHighSalesDays(int[] sales) {
        int count = 0;
        for (int s : sales) {
            if (s > 100) {
                count++;
            }
        }
        return count;
    }

    static void searchSale(int[] sales, int value) {
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == value) {
                System.out.println("Sale " + value + " found on Day " + (i + 1));
                return;
            }
        }
        System.out.println("Sale " + value + " not found");
    }

    static void updateSales(int[] sales, int day, int newValue) {
        sales[day - 1] = newValue;
        System.out.println("Updated sales for Day " + day + ": " + sales[day - 1]);
    }

    public static void main(String[] args) {

        int[] sales = {120, 80, 150, 90, 200, 75, 110};
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

        System.out.printf("Average Temperature: %.1f°C\n", averageTemperature(temperatures));
        hottestAndColdestDay(temperatures);
        System.out.println("Number of hot days (>30°C): " + countHotDays(temperatures));
        totalAndAverageSales(sales);
        recordBreakingSales(sales);
        System.out.println("Number of high sales days (>100): " + countHighSalesDays(sales));
        searchSale(sales, 150);
        updateSales(sales, 2, 95);
    }
}
