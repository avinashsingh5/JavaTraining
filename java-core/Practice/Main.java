import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class cakeOrder{
    private Map<String,Double> orderMap = new HashMap<>(); // orderid, cake cost 


    public void addOrder(String orderId, double cakeCost){
        orderMap.put(orderId,cakeCost);
    }

    public Map<String,Double> findOrdersAboveSpecificCost(double cakeCost){
        Map<String, Double> mp = new HashMap<>();
        for(Map.Entry<String,Double> entry: orderMap.entrySet()){
            if(entry.getValue()>cakeCost){
                mp.put(entry.getKey(),entry.getValue());
            }
        }
        return mp;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cakeOrder o1 = new cakeOrder();
        System.out.println("Enter the number of cake orders to be added");
        int n = sc.nextInt();
        System.out.println("Enter order details(Cake id: cake cost)");
        sc.nextLine();
        for(int i=0;i<n;i++){
           String input = sc.nextLine();
           String[] parts  = input.split(":");
            o1.addOrder(parts[0],Double.parseDouble(parts[1]));
        }
        System.out.println("Enter the cost to search the cake order");
        double priceToFind = sc.nextDouble();
        Map<String,Double> map = new HashMap<>();
        map = o1.findOrdersAboveSpecificCost(priceToFind);
        if(map.isEmpty()){
            System.out.println("No cake orders found");
        }
        else{
            System.out.println("cake orders aboave specific cost");
            for(Map.Entry<String,Double> entry: map.entrySet()){
                System.out.println("cake Id: "+entry.getKey()+","+" cake cost: "+entry.getValue());
            }
        }

    }
}