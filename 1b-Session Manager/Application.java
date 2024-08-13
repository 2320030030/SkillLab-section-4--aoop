package SessionManager;

public class Application {
    public static void main(String[] args) {
        
        SessionManager session = SessionManager.getInstance();
        session.authenticate("JohnDoe");

       
        Account account = new Account(500.00);
        account.displayBalance();   
        BalanceAccount balanceAccount = new BalanceAccount(500.00);
        balanceAccount.addFunds(100.00); 

        WithdrawlAccount withdrawlAccount = new WithdrawlAccount(500.00);
        withdrawlAccount.withdrawFunds(50.00); 

        
        session.endSession();
        account.displayBalance();   
        balanceAccount.addFunds(100.00);   
        withdrawlAccount.withdrawFunds(50.00); 
    }
}
