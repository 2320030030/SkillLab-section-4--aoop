package SessionManager;

public class BalanceAccount {
    private double currentBalance;

    public BalanceAccount(double initialAmount) {
        this.currentBalance = initialAmount;
    }

    public void addFunds(double amount) {
        SessionManager session = SessionManager.getInstance();
        if (session.isSessionActive()) {
            currentBalance += amount;
            System.out.println("Added $" + amount + " to account. Updated Balance: $" + currentBalance);
        } else {
            System.out.println("You must be logged in to add funds.");
        }
    }
}
