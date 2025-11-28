public class Order {
    private String orderId;
    private int quantity;
    private double price;

    public Order(String orderId, int quantity, double price) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderId() { return orderId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Qty: " + quantity + ", Price: " + price;
    }
}