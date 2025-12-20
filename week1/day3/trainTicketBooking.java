import java.util.Scanner;

public class trainTicketBooking {
    public static void main(String[] args){
        int passenger_ID;
        String passenger_Name;
        int Age;
        String travel_type;
        String travel_class;
        double baseFare;
        boolean isGovernmentEmployee;
        int citizen_discount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Passenger_ID: ");
        passenger_ID = sc.nextInt();

        System.out.println("Enter your Name: ");
        passenger_Name = sc.next();

        System.out.println("Enter your Age: ");
        Age = sc.nextInt();

        if(Age < 5){
            System.out.println("Free ticket No-booking required");
            return;
        }
        if(Age > 80){
            System.out.println("Medical clearence required");
            return;
        }
        if(Age <= 0 || Age >= 150){
            System.out.println("Enter Valid age");
            return;
        }

        System.out.println("Enter 1 for Bus , 2 for Train , 3 for Flight");
        int travel_typeHelper = sc.nextInt();

        switch (travel_typeHelper){
            case 1:
                travel_type = "Bus";
                break;
            case 2:
                travel_type = "Train";
                break;
            case 3:
                travel_type = "Flight";
                break;
            default:
                System.out.println("Enter valid response");
                return;
        }

        int travel_classHelper;

        switch (travel_type){

            case "Bus":
                System.out.println("Enter 1 for Sleeper and 2 for Seater");
                travel_classHelper = sc.nextInt();

                if(travel_classHelper == 1)
                    travel_class = "Sleeper";
                else if(travel_classHelper == 2)
                    travel_class = "Seater";
                else{
                    System.out.println("pleasee enter valid input");
                    return;
                }
                break;

            case "Train":
                System.out.println("Enter 1 for General , 2 for Sleeper and 3 for AC");
                travel_classHelper = sc.nextInt();

                if(travel_classHelper == 1)
                    travel_class = "General";
                else if(travel_classHelper == 2)
                    travel_class = "Sleeper";
                else if(travel_classHelper == 3)
                    travel_class = "AC";
                else{
                    System.out.println("pleasee enter valid input");
                    return;
                }
                break;

            case "Flight":
                System.out.println("Enter 1 for Economy and 2 for Business");
                travel_classHelper = sc.nextInt();

                if(travel_classHelper == 1)
                    travel_class = "Economy";
                else if(travel_classHelper == 2)
                    travel_class = "Business";
                else{
                    System.out.println("pleasee enter valid input");
                    return;
                }
                break;

            default:
                System.out.println("pleasee enter valid input");
                return;
        }

        System.out.println("Press 1 if you are a government Employee");
        int govEmployeeHelper = sc.nextInt();

        if(govEmployeeHelper == 1)
            isGovernmentEmployee = true;
        else
            isGovernmentEmployee = false;

        if(Age >= 60)
            citizen_discount = 30;
        else if(isGovernmentEmployee)
            citizen_discount = 15;
        else if(Age >= 5 && Age <= 12)
            citizen_discount = 50;
        else
            citizen_discount = 0;

        System.out.println("Enter FareAmount");
        baseFare = sc.nextDouble();

        double discount = ((double) citizen_discount / 100) * baseFare;
        double finalFare = baseFare - discount;

        if(finalFare > 10000 && travel_type.equals("Flight"))
            System.out.println("Booking status Confirmed");
        else
            System.out.println("Booking status waitlisted");

        sc.close();
    }
}
