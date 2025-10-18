// Client code — uses only the Facade class
public class Main {
    public static void main(String[] args) {
        // Create a facade instance
        OnlineShopFacade shop = new OnlineShopFacade();

        // Place an order using one simple method (Facade)
        shop.placeOrder(
                "AirPods Pro",                     // product name
                59990,                             // price in $
                "Aliya Nurgaliyeva",               // name
                "Mangilik El 15, Astana, Kazakhstan" // address
        );
    }
}
