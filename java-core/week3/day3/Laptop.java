public class Laptop {
    String brand;
    int ramSize;
    double price;

    Laptop(){
        brand = "Unknown";
        ramSize = 8;
        price = 50000.0;
    }
    Laptop(String brand){
        this.brand = brand;
    }
    Laptop(String brand, int ramSize){
        this(brand);
        this.ramSize = ramSize;
    }
    Laptop(String brand, int ramSize , double price){
        this(brand,ramSize);
        this.price = price;
    }
    public  static void print(Laptop obj){
        System.out.println("Brand name is: "+ obj.brand);
        System.out.println("ramSize is: "+ obj.ramSize);
        System.out.println("Price is: "+ obj.price);
        System.out.println();
    }
    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        print(l1);
        Laptop l2 = new Laptop("Lenevo",16,50000);
        print(l2);

    }
}