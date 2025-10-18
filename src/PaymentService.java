// Handles payment processing
public class PaymentService {
    // Processes payment for the given customer
    public boolean makePayment(String customer, double amount) {
        System.out.println("Processing payment of $" + amount + " for " + customer + "...");
        return true; // Assume payment is always successful
    }
}
