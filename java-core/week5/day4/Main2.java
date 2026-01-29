//basic interface example with real life analogy

interface Vehicle{

    void changeGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        if(newGear>0 && newGear<5) gear = newGear;
        else System.out.println("Invalid gear");
    }

    @Override
    public void speedUp(int newSpeed){
        if(newSpeed>=0 && speed+newSpeed<=80) speed += newSpeed;
        else System.out.println("Invalid speed");
    }

    @Override 
    public void applyBrake(int decrement){
        if(decrement<= speed) speed -= decrement;
        else System.out.println("Invalid");
    }

    public void display(){
        System.out.println("speed: "+speed+" Gear: "+gear);
    }
}
public class Main2{
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(1);
        b.speedUp(20);
        b.display();
        b.changeGear(2);
        b.speedUp(40);
        b.display();
        b.changeGear(-5);
    }
}