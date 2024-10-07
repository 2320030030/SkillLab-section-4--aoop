package BankAccount;

public class BankAccountManagementSystem {

    public static void main(String[] args) {
        
        BankAccount sharedAccount = new BankAccount(1000);

        Thread user1 = new Thread(new BankTransaction(sharedAccount), "User1");
        Thread user2 = new Thread(new BankTransaction(sharedAccount), "User2");
        Thread user3 = new Thread(new BankTransaction(sharedAccount), "User3");

        
        user1.start();
        user2.start();
        user3.start();

      
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: $" + sharedAccount.getBalance());
    }
}