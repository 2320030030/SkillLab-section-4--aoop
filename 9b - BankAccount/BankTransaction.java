package BankAccount;

class BankTransaction implements Runnable {
    private BankAccount account;

    public BankTransaction(BankAccount account) {
        this.account = account;
    }

    public void run() {
        
        account.deposit(100);
        account.withdraw(50);
        account.deposit(200);
        account.withdraw(150);
        account.withdraw(500);  
    }
}