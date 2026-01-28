public class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=0) {
            System.out.println("Amount should be greater than 0");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return ;
        }
        balance -= amount;
    }

    public double getbalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("1234",10000.00);
        b1.deposit(1000);
        b1.withdraw(15000);
        b1.withdraw(5000);
        System.out.println("Your balnce is : "+ b1.getbalance());
    }
}