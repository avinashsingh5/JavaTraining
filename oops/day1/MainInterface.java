import java.util.*;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Bike implements Vehicle {
    int speed;
    int gear;

    //change gear
    @Override
    public void changeGear(int gear){
        this.gear = gear;
    }

    //increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    //decreae speed
    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed "+ speed + " gear : "+ gear);
    }

}

class Car implements Vehicle {
    int speed;
    int gear;

    //change gear
    @Override
    public void changeGear(int gear){
        this.gear = gear;
    }

    //increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    //decreae speed
    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed "+ speed + "  gear : "+ gear);
    }
}

class MainInterface{
    public static void main(String[] args){
        Bike bullet = new Bike();
        bullet.speed = 20;
        bullet.gear =  1;

        bullet.changeGear(2);
        bullet.speedUp(20);

        bullet.printStates();


        Car verna = new Car();
        verna.speed = 40;
        verna.gear = 2;

        verna.speedUp(50);
        verna.changeGear(3);

        verna.printStates();
    }
}