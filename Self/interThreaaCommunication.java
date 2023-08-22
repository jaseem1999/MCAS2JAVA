package Self;

public class interThreaaCommunication {
    public static void main(String[] args) {
        final Account a = new Account();
        new Thread() {
            public void run() {
                a.withdraw(15000);
            }
        }.start(); 
        new Thread() {
            public void run() {
                a.deposit(10000);
            }
        }.start();

        new Thread() {
            public void run() {
                System.out.println("Final Balance: " + a.getBalance());
            }
        }.start();
    }
}

class Account{
    double balance = 5000;
    double amount;
    synchronized void withdraw(double amount) {
        this.amount = amount;
        System.out.println("Going to withdraw...");
        if (balance < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                System.out.println("Waiting...");
                wait();
                System.out.println("Wait completed...");
                balance -= amount;
                System.out.println("after Deposit and Withdraw completed... (Amount: " + amount + "))");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else {
            balance -= amount;
            System.out.println("Withdraw completed...");
        }
    }

    synchronized void deposit(double amount) {
        System.out.println("Going to deposit...");
        balance += amount;
        System.out.println("Deposit completed...");
        notify();
        System.out.println("Notify completed...");
        System.out.println("Balance: " + balance);

    }

    synchronized double getBalance() {
       //all thraads are executed then only it will return the balance
        return balance;
    }



}