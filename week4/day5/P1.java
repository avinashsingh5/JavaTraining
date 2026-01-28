abstract class Payment{
        private int amount;
        Payment(int amount){
            this.amount = amount;
        }
        //getter
        public int getAmount(){
            return amount;
        }

        //abstract method 
        abstract void processPayment();
    }

    class CreditCardPayment extends Payment{
        private int cardNumber;

        CreditCardPayment(int amount,int cardNumber){
            super(amount);
            this.cardNumber = cardNumber;

        }

        public void processPayment(){
            System.out.println("Processing credit card payment of "+getAmount()+ " using card "+cardNumber);
        }
    }

    class UPIPayment extends Payment{
        private int upiID;
        
        UPIPayment(int amount,int upiID){
            super(amount);
            this.upiID = upiID;
        }

        void processPayment(){
            System.out.println("Processing upi payment of "+getAmount()+" using UPI ID "+upiID);
        }
    }

    class MakePayment {
        
        public void makePayment(Payment payment){
            payment.processPayment();
        }
        
    }
public class P1{
    public static void main(String[] args) {
        Payment c1 = new CreditCardPayment(200,121212);
        MakePayment mp = new MakePayment();
        mp.makePayment(c1);
    }
}