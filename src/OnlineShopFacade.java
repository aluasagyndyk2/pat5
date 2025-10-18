// Facade class - hides complexity of multiple subsystems
public class OnlineShopFacade {
    private ProductService productService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    // Constructor initializes all subsystems
    public OnlineShopFacade() {
        this.productService = new ProductService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    // The main method used by client: it combines all steps into one
    public void placeOrder(String product, double price, String customer, String address) {
        System.out.println("     Starting order process");
        System.out.println(" ");

        // Step 1: Check if product is in stock
        if (productService.checkAvailability(product)) {

            // Step 2: Try to make payment
            if (paymentService.makePayment(customer, price)) {

                // Step 3: Ship product
                shippingService.shipProduct(product, address);

                // Step 4: Send notification
                notificationService.sendConfirmation(customer);

                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Product not available.");
        }
        System.out.println(" ");

        System.out.println("     End of process");
    }
}
