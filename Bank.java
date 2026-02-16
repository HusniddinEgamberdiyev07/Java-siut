class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String h, int n, double b){
        accountHolder = h;
        accountNumber = n;
        balance = b;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withDraw(double amount){
        double current = balance-amount;
        if(current > 0){
            balance -= amount;
        }else{
            System.out.println("You don't have enough money!");
        }
    }

    void displayDetails(){
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount me = new BankAccount("Husniddin", 101, 1000);
        me.displayDetails();   
        me.withDraw(900);
        me.displayDetails();
        me.withDraw(900);
        me.deposit(1000);
        me.withDraw(900);
        me.displayDetails();
    }
}