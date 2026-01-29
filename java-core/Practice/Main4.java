//Heaven Homes

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
class Apartment{
    private Map<String,Double> apartmentDetailsMap = new HashMap<>();

    public void addApartmentDetails(String apartmentNumber, double rent){
        apartmentDetailsMap.put(apartmentNumber,rent);
    }

    //filter apartment
    public double findTotalRentOfApartmentsInTheGivenRange(double minimumRent, double maximumRent){
        double total = 0.0;
        for(Map.Entry<String,Double> entry: apartmentDetailsMap.entrySet()){
            if(entry.getValue()>= minimumRent && entry.getValue()<=maximumRent){
                total += entry.getValue();
            }
        }
        return total;
    }
}
public class Main4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apartment a = new Apartment();
      System.out.println("Enter the number of details to be added : ");  
      int n = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the details (Apartment number:rent)");
      for(int i=0;i<n;i++){
        String s = sc.nextLine();
        String[] input = s.split(":");
        Double rent = Double.parseDouble(input[1]);
        a.addApartmentDetails(input[0],rent);
      }
      System.out.println("Enter the range to filter details: ");
      double min = sc.nextDouble();
      double max = sc.nextDouble();
      double ans = a.findTotalRentOfApartmentsInTheGivenRange(min,max);
      if(ans==0.0){
        System.out.println("NO apartment found in the range");
      }
      else{
      System.out.println("Total rent in the range "+min + " to "+max+" USD: "+ans);
      }
    }
}