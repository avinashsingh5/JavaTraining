// A payment system where different payment methods calculate transaction fees differnetly

abstract class Payment{
    private double  amount;
    private String currency;

    Payment(double amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }

    public double getFinalAmount(){
        return amount+calculateFee();
    }

    abstract double calculateFee();

}

class creditCardPayment extends Payment{
    private String cardType;


    creditCardPayment(String cardType, double amount, String currency){
        super(amount,currency);
        this.cardType =cardType;

        
    }

    @Override
    public double calculateFee(){
        if(cardType.equalsIgnoreCase("VISA"))return  0.02*getAmount();
        else if(cardType.equalsIgnoreCase("MASTERCARD"))return 0.025*getAmount();
        else return 0.03*getAmount();
    }
}

class UPIPayment extends Payment{
    private String bankName;

    UPIPayment(double amount,String currency,String bankName){
        super(amount,currency);
        this.bankName = bankName;
    }

    @Override
    public double calculateFee(){
        if(getAmount()<=1000) return 0;
        else return 10;
    }

}

class PaymentProcessor{
    public void processPayment(Payment payment){
        System.out.println("Payment type is: "+payment.getClass().getSimpleName());
        System.out.println("Fee is: "+payment.calculateFee());
        System.out.println("Final Amount: "+payment.getFinalAmount());
    }
}

public class Main{
    public static void main(String[] args) {
        creditCardPayment c1 = new creditCardPayment("VISA",1000000,"DOLLAR");
       c1.calculateFee();
       PaymentProcessor p1 = new PaymentProcessor();
       p1.processPayment(c1);

       UPIPayment u1 = new UPIPayment(12000,"INR","SBI");
       u1.calculateFee();
       p1.processPayment(u1);
    }
}