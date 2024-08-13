package SessionManager;

public class Account {
    private double accountBalance;

    public Account(double initialAmount) {
        this.accountBalance = initialAmount;
    }

    public void displayBalance() {
        SessionManager session = SessionManager.getInstance();
        if (session.isSessionActive()) {
            System.out.println("Current User: " + session.getCurrentUser() + ", Balance: $" + accountBalance);
        } else {
            System.out.println("Please log in to view the balance.");
        }
    }
}
