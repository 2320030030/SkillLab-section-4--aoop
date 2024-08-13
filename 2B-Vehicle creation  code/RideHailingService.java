package VehicleCreation;

public class RideHailingService {
    public static void main(String[] args) {
       
        AuthService authService = AuthService.getInstance();
        authService.signIn("john_doe");

        
        PaymentProcessorFactory paymentProcessorFactory = new CardPaymentFactory(); 
        PaymentProcessor paymentProcessor = paymentProcessorFactory.createProcessor();
        paymentProcessor.handlePayment(25.0);

        // Sign out user
        authService.signOut();
    }
}
